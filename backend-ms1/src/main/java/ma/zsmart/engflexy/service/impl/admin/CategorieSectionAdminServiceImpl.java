package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.CategorieSection;
import ma.zsmart.engflexy.bean.core.Section;
import ma.zsmart.engflexy.bean.history.CategorieSectionHistory;
import ma.zsmart.engflexy.dao.criteria.core.CategorieSectionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.CategorieSectionDao;
import ma.zsmart.engflexy.dao.facade.history.CategorieSectionHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.CategorieSectionSpecification;
import ma.zsmart.engflexy.service.facade.admin.CategorieSectionAdminService;
import ma.zsmart.engflexy.service.facade.admin.SectionAdminService;
import ma.zsmart.engflexy.service.facade.admin.SuperCategorieSectionAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CategorieSectionAdminServiceImpl extends AbstractServiceImpl<CategorieSection,CategorieSectionHistory, CategorieSectionCriteria, CategorieSectionHistoryCriteria, CategorieSectionDao,
CategorieSectionHistoryDao> implements CategorieSectionAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    @Override
    public CategorieSection create(CategorieSection t) {
        super.create(t);
        if (t.getSections() != null) {
                t.getSections().forEach(element-> {
                    element.setCategorieSection(t);
                    sectionService.create(element);
            });
        }
        return t;
    }
    @Override
    public CategorieSection findWithAssociatedLists(Long id){
        CategorieSection result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setSections(sectionService.findByCategorieSectionId(id));
        }
        return result;
    }
    @Override
    @Transactional
    public void deleteAssociatedLists(Long id) {
        sectionService.deleteByCategorieSectionId(id);
    }


    @Override
    public void updateWithAssociatedLists(CategorieSection categorieSection){
    if(categorieSection !=null && categorieSection.getId() != null){
            List<List<Section>> resultSections= sectionService.getToBeSavedAndToBeDeleted(sectionService.findByCategorieSectionId(categorieSection.getId()),categorieSection.getSections());
            sectionService.delete(resultSections.get(1));
            ListUtil.emptyIfNull(resultSections.get(0)).forEach(e -> e.setCategorieSection(categorieSection));
            sectionService.update(resultSections.get(0),true);
    }
    }
    @Override
    public CategorieSection findByReferenceEntity(CategorieSection t){
        return  dao.findByCode(t.getCode());
    }

    public List<CategorieSection> findBySuperCategorieSectionId(Long id){
        return dao.findBySuperCategorieSectionId(id);
    }
    public int deleteBySuperCategorieSectionId(Long id){
        return dao.deleteBySuperCategorieSectionId(id);
    }



    public void configure() {
        super.configure(CategorieSection.class,CategorieSectionHistory.class, CategorieSectionHistoryCriteria.class, CategorieSectionSpecification.class);
    }

    @Autowired
    private SuperCategorieSectionAdminService superCategorieSectionService ;
    @Autowired
    private SectionAdminService sectionService ;

    public CategorieSectionAdminServiceImpl(CategorieSectionDao dao, CategorieSectionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}