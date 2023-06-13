package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.StatutFreeTrialHistory;
import ma.zsmart.engflexy.dao.criteria.history.StatutFreeTrialHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class StatutFreeTrialHistorySpecification extends AbstractHistorySpecification<StatutFreeTrialHistoryCriteria, StatutFreeTrialHistory> {

    public StatutFreeTrialHistorySpecification(StatutFreeTrialHistoryCriteria criteria) {
        super(criteria);
    }

    public StatutFreeTrialHistorySpecification(StatutFreeTrialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
