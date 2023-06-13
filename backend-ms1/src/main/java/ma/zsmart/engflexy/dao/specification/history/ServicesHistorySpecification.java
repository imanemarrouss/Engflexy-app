package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.ServicesHistory;
import ma.zsmart.engflexy.dao.criteria.history.ServicesHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class ServicesHistorySpecification extends AbstractHistorySpecification<ServicesHistoryCriteria, ServicesHistory> {

    public ServicesHistorySpecification(ServicesHistoryCriteria criteria) {
        super(criteria);
    }

    public ServicesHistorySpecification(ServicesHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
