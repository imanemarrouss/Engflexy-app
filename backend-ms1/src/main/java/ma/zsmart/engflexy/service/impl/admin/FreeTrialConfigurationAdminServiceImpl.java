package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.FreeTrialConfiguration;
import ma.zsmart.engflexy.bean.history.FreeTrialConfigurationHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialConfigurationCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.FreeTrialConfigurationDao;
import ma.zsmart.engflexy.dao.facade.history.FreeTrialConfigurationHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.FreeTrialConfigurationSpecification;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialConfigurationAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class FreeTrialConfigurationAdminServiceImpl extends AbstractServiceImpl<FreeTrialConfiguration,FreeTrialConfigurationHistory, FreeTrialConfigurationCriteria, FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationDao,
FreeTrialConfigurationHistoryDao> implements FreeTrialConfigurationAdminService {






    public void configure() {
        super.configure(FreeTrialConfiguration.class,FreeTrialConfigurationHistory.class, FreeTrialConfigurationHistoryCriteria.class, FreeTrialConfigurationSpecification.class);
    }


    public FreeTrialConfigurationAdminServiceImpl(FreeTrialConfigurationDao dao, FreeTrialConfigurationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}