package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.FreeTrialformule;
import ma.zsmart.engflexy.bean.history.FreeTrialformuleHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialformuleCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.FreeTrialformuleDao;
import ma.zsmart.engflexy.dao.facade.history.FreeTrialformuleHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.FreeTrialformuleSpecification;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialformuleAdminService;
import ma.zsmart.engflexy.service.facade.admin.InscriptionAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FreeTrialformuleAdminServiceImpl extends AbstractServiceImpl<FreeTrialformule,FreeTrialformuleHistory, FreeTrialformuleCriteria, FreeTrialformuleHistoryCriteria, FreeTrialformuleDao,
FreeTrialformuleHistoryDao> implements FreeTrialformuleAdminService {


    public FreeTrialformule findByReferenceEntity(FreeTrialformule t){
        return  dao.findByCode(t.getCode());
    }

    public List<FreeTrialformule> findByInscriptionId(Long id){
        return dao.findByInscriptionId(id);
    }
    public int deleteByInscriptionId(Long id){
        return dao.deleteByInscriptionId(id);
    }



    public void configure() {
        super.configure(FreeTrialformule.class,FreeTrialformuleHistory.class, FreeTrialformuleHistoryCriteria.class, FreeTrialformuleSpecification.class);
    }

    @Autowired
    private InscriptionAdminService inscriptionService ;

    public FreeTrialformuleAdminServiceImpl(FreeTrialformuleDao dao, FreeTrialformuleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}