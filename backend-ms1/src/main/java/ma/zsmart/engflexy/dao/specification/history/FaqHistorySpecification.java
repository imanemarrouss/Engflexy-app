package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FaqHistory;
import ma.zsmart.engflexy.dao.criteria.history.FaqHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FaqHistorySpecification extends AbstractHistorySpecification<FaqHistoryCriteria, FaqHistory> {

    public FaqHistorySpecification(FaqHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqHistorySpecification(FaqHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
