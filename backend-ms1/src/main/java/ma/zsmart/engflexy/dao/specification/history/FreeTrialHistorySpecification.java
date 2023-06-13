package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FreeTrialHistory;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialHistorySpecification extends AbstractHistorySpecification<FreeTrialHistoryCriteria, FreeTrialHistory> {

    public FreeTrialHistorySpecification(FreeTrialHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialHistorySpecification(FreeTrialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
