package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FreeTrialformuleHistory;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialformuleHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialformuleHistorySpecification extends AbstractHistorySpecification<FreeTrialformuleHistoryCriteria, FreeTrialformuleHistory> {

    public FreeTrialformuleHistorySpecification(FreeTrialformuleHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialformuleHistorySpecification(FreeTrialformuleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
