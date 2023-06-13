package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.PriceHistory;
import ma.zsmart.engflexy.dao.criteria.history.PriceHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class PriceHistorySpecification extends AbstractHistorySpecification<PriceHistoryCriteria, PriceHistory> {

    public PriceHistorySpecification(PriceHistoryCriteria criteria) {
        super(criteria);
    }

    public PriceHistorySpecification(PriceHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
