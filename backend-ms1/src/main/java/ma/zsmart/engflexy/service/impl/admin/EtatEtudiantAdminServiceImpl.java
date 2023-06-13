package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.EtatEtudiant;
import ma.zsmart.engflexy.bean.history.EtatEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtatEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtatEtudiantHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.EtatEtudiantDao;
import ma.zsmart.engflexy.dao.facade.history.EtatEtudiantHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.EtatEtudiantSpecification;
import ma.zsmart.engflexy.service.facade.admin.EtatEtudiantAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class EtatEtudiantAdminServiceImpl extends AbstractServiceImpl<EtatEtudiant,EtatEtudiantHistory, EtatEtudiantCriteria, EtatEtudiantHistoryCriteria, EtatEtudiantDao,
EtatEtudiantHistoryDao> implements EtatEtudiantAdminService {


    public EtatEtudiant findByReferenceEntity(EtatEtudiant t){
        return  dao.findByReference(t.getReference());
    }




    public void configure() {
        super.configure(EtatEtudiant.class,EtatEtudiantHistory.class, EtatEtudiantHistoryCriteria.class, EtatEtudiantSpecification.class);
    }


    public EtatEtudiantAdminServiceImpl(EtatEtudiantDao dao, EtatEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}