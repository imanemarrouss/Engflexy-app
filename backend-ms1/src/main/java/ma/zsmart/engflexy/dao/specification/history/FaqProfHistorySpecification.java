package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FaqProfHistory;
import ma.zsmart.engflexy.dao.criteria.history.FaqProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FaqProfHistorySpecification extends AbstractHistorySpecification<FaqProfHistoryCriteria, FaqProfHistory> {

    public FaqProfHistorySpecification(FaqProfHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqProfHistorySpecification(FaqProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
