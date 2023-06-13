package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Section;
import ma.zsmart.engflexy.bean.core.SectionItem;
import ma.zsmart.engflexy.bean.history.SectionHistory;
import ma.zsmart.engflexy.dao.criteria.core.SectionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.SectionHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.SectionDao;
import ma.zsmart.engflexy.dao.facade.history.SectionHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.SectionSpecification;
import ma.zsmart.engflexy.service.facade.admin.*;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class SectionAdminServiceImpl extends AbstractServiceImpl<Section,SectionHistory, SectionCriteria, SectionHistoryCriteria, SectionDao,
SectionHistoryDao> implements SectionAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Section create(Section t) {
        super.create(t);
        if (t.getSectionItems() != null) {
                t.getSectionItems().forEach(element-> {
                    element.setSection(t);
                    sectionItemService.create(element);
            });
        }
        return t;
    }

    public Section findWithAssociatedLists(Long id){
        Section result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setSectionItems(sectionItemService.findBySectionId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        sectionItemService.deleteBySectionId(id);
    }


    public void updateWithAssociatedLists(Section section){
    if(section !=null && section.getId() != null){
            List<List<SectionItem>> resultSectionItems= sectionItemService.getToBeSavedAndToBeDeleted(sectionItemService.findBySectionId(section.getId()),section.getSectionItems());
            sectionItemService.delete(resultSectionItems.get(1));
            ListUtil.emptyIfNull(resultSectionItems.get(0)).forEach(e -> e.setSection(section));
            sectionItemService.update(resultSectionItems.get(0),true);
    }
    }

    public Section findByReferenceEntity(Section t){
        return  dao.findByCode(t.getCode());
    }

    public List<Section> findByCategorieSectionId(Long id){
        return dao.findByCategorieSectionId(id);
    }
    public int deleteByCategorieSectionId(Long id){
        return dao.deleteByCategorieSectionId(id);
    }
    public List<Section> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }
    public List<Section> findBySessionCoursId(Long id){
        return dao.findBySessionCoursId(id);
    }
    public int deleteBySessionCoursId(Long id){
        return dao.deleteBySessionCoursId(id);
    }



    public void configure() {
        super.configure(Section.class,SectionHistory.class, SectionHistoryCriteria.class, SectionSpecification.class);
    }

    @Autowired
    private CoursAdminService coursService ;
    @Autowired
    private SectionItemAdminService sectionItemService ;
    @Autowired
    private SessionCoursAdminService sessionCoursService ;
    @Autowired
    private CategorieSectionAdminService categorieSectionService ;

    public SectionAdminServiceImpl(SectionDao dao, SectionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}