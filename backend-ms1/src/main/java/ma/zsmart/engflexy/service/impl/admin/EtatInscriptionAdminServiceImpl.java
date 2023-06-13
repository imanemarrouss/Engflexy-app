package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.EtatInscription;
import ma.zsmart.engflexy.bean.history.EtatInscriptionHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtatInscriptionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtatInscriptionHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.EtatInscriptionDao;
import ma.zsmart.engflexy.dao.facade.history.EtatInscriptionHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.EtatInscriptionSpecification;
import ma.zsmart.engflexy.service.facade.admin.EtatInscriptionAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class EtatInscriptionAdminServiceImpl extends AbstractServiceImpl<EtatInscription,EtatInscriptionHistory, EtatInscriptionCriteria, EtatInscriptionHistoryCriteria, EtatInscriptionDao,
EtatInscriptionHistoryDao> implements EtatInscriptionAdminService {


    public EtatInscription findByReferenceEntity(EtatInscription t){
        return  dao.findByLibelle(t.getLibelle());
    }




    public void configure() {
        super.configure(EtatInscription.class,EtatInscriptionHistory.class, EtatInscriptionHistoryCriteria.class, EtatInscriptionSpecification.class);
    }


    public EtatInscriptionAdminServiceImpl(EtatInscriptionDao dao, EtatInscriptionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}