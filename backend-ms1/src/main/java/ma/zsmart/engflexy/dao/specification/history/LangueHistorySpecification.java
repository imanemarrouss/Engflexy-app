package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.LangueHistory;
import ma.zsmart.engflexy.dao.criteria.history.LangueHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class LangueHistorySpecification extends AbstractHistorySpecification<LangueHistoryCriteria, LangueHistory> {

    public LangueHistorySpecification(LangueHistoryCriteria criteria) {
        super(criteria);
    }

    public LangueHistorySpecification(LangueHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
