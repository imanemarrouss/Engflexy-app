package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.CategorieProf;
import ma.zsmart.engflexy.bean.core.Prof;
import ma.zsmart.engflexy.bean.history.CategorieProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.CategorieProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.CategorieProfHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.CategorieProfDao;
import ma.zsmart.engflexy.dao.facade.history.CategorieProfHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.CategorieProfSpecification;
import ma.zsmart.engflexy.service.facade.admin.CategorieProfAdminService;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CategorieProfAdminServiceImpl extends AbstractServiceImpl<CategorieProf,CategorieProfHistory, CategorieProfCriteria, CategorieProfHistoryCriteria, CategorieProfDao,
CategorieProfHistoryDao> implements CategorieProfAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    @Override
    public CategorieProf create(CategorieProf t) {
        super.create(t);
        if (t.getProfs() != null) {
                t.getProfs().forEach(element-> {
                    element.setCategorieProf(t);
                    profService.create(element);
            });
        }
        return t;
    }
    @Override
    public CategorieProf findWithAssociatedLists(Long id){
        CategorieProf result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setProfs(profService.findByCategorieProfId(id));
        }
        return result;
    }
    @Override
    @Transactional
    public void deleteAssociatedLists(Long id) {
        profService.deleteByCategorieProfId(id);
    }

    @Override
    public void updateWithAssociatedLists(CategorieProf categorieProf){
    if(categorieProf !=null && categorieProf.getId() != null){
            List<List<Prof>> resultProfs= profService.getToBeSavedAndToBeDeleted(profService.findByCategorieProfId(categorieProf.getId()),categorieProf.getProfs());
            profService.delete(resultProfs.get(1));
            ListUtil.emptyIfNull(resultProfs.get(0)).forEach(e -> e.setCategorieProf(categorieProf));
            profService.update(resultProfs.get(0),true);
    }
    }

    @Override
    public CategorieProf findByReferenceEntity(CategorieProf t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(CategorieProf.class,CategorieProfHistory.class, CategorieProfHistoryCriteria.class, CategorieProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;

    public CategorieProfAdminServiceImpl(CategorieProfDao dao, CategorieProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}