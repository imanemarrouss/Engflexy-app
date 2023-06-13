package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FreeTrialConfigurationHistory;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialConfigurationHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialConfigurationHistorySpecification extends AbstractHistorySpecification<FreeTrialConfigurationHistoryCriteria, FreeTrialConfigurationHistory> {

    public FreeTrialConfigurationHistorySpecification(FreeTrialConfigurationHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialConfigurationHistorySpecification(FreeTrialConfigurationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
