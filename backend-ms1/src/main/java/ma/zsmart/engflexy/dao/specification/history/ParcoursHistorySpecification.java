package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.ParcoursHistory;
import ma.zsmart.engflexy.dao.criteria.history.ParcoursHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class ParcoursHistorySpecification extends AbstractHistorySpecification<ParcoursHistoryCriteria, ParcoursHistory> {

    public ParcoursHistorySpecification(ParcoursHistoryCriteria criteria) {
        super(criteria);
    }

    public ParcoursHistorySpecification(ParcoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
