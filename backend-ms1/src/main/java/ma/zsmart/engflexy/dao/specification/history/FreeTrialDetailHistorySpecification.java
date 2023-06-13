package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FreeTrialDetailHistory;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialDetailHistorySpecification extends AbstractHistorySpecification<FreeTrialDetailHistoryCriteria, FreeTrialDetailHistory> {

    public FreeTrialDetailHistorySpecification(FreeTrialDetailHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialDetailHistorySpecification(FreeTrialDetailHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
