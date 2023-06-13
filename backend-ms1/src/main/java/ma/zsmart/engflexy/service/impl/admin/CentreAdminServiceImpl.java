package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Centre;
import ma.zsmart.engflexy.bean.core.Parcours;
import ma.zsmart.engflexy.bean.history.CentreHistory;
import ma.zsmart.engflexy.dao.criteria.core.CentreCriteria;
import ma.zsmart.engflexy.dao.criteria.history.CentreHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.CentreDao;
import ma.zsmart.engflexy.dao.facade.history.CentreHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.CentreSpecification;
import ma.zsmart.engflexy.service.facade.admin.CentreAdminService;
import ma.zsmart.engflexy.service.facade.admin.ParcoursAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class CentreAdminServiceImpl extends AbstractServiceImpl<Centre,CentreHistory, CentreCriteria, CentreHistoryCriteria, CentreDao,
CentreHistoryDao> implements CentreAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    @Override
    public Centre create(Centre t) {
        super.create(t);
        if (t.getParcourss() != null) {
                t.getParcourss().forEach(element-> {
                    element.setCentre(t);
                    parcoursService.create(element);
            });
        }
        return t;
    }
    @Override
    public Centre findWithAssociatedLists(Long id){
        Centre result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setParcourss(parcoursService.findByCentreId(id));
        }
        return result;
    }
    @Transactional
    @Override
    public void deleteAssociatedLists(Long id) {
        parcoursService.deleteByCentreId(id);
    }

    @Override
    public void updateWithAssociatedLists(Centre centre){
    if(centre !=null && centre.getId() != null){
            List<List<Parcours>> resultParcourss= parcoursService.getToBeSavedAndToBeDeleted(parcoursService.findByCentreId(centre.getId()),centre.getParcourss());
            parcoursService.delete(resultParcourss.get(1));
            ListUtil.emptyIfNull(resultParcourss.get(0)).forEach(e -> e.setCentre(centre));
            parcoursService.update(resultParcourss.get(0),true);
    }
    }
    @Override
    public Centre findByReferenceEntity(Centre t){
        return  dao.findByRef(t.getRef());
    }




    public void configure() {
        super.configure(Centre.class,CentreHistory.class, CentreHistoryCriteria.class, CentreSpecification.class);
    }

    @Autowired
    private ParcoursAdminService parcoursService ;

    public CentreAdminServiceImpl(CentreDao dao, CentreHistoryDao historyDao) {
        super(dao, historyDao);
    }

}