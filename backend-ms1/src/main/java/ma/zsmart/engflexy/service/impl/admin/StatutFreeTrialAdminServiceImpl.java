package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.StatutFreeTrial;
import ma.zsmart.engflexy.bean.history.StatutFreeTrialHistory;
import ma.zsmart.engflexy.dao.criteria.core.StatutFreeTrialCriteria;
import ma.zsmart.engflexy.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.StatutFreeTrialDao;
import ma.zsmart.engflexy.dao.facade.history.StatutFreeTrialHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.StatutFreeTrialSpecification;
import ma.zsmart.engflexy.service.facade.admin.StatutFreeTrialAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class StatutFreeTrialAdminServiceImpl extends AbstractServiceImpl<StatutFreeTrial,StatutFreeTrialHistory, StatutFreeTrialCriteria, StatutFreeTrialHistoryCriteria, StatutFreeTrialDao,
StatutFreeTrialHistoryDao> implements StatutFreeTrialAdminService {


    public StatutFreeTrial findByReferenceEntity(StatutFreeTrial t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(StatutFreeTrial.class,StatutFreeTrialHistory.class, StatutFreeTrialHistoryCriteria.class, StatutFreeTrialSpecification.class);
    }


    public StatutFreeTrialAdminServiceImpl(StatutFreeTrialDao dao, StatutFreeTrialHistoryDao historyDao) {
        super(dao, historyDao);
    }

}