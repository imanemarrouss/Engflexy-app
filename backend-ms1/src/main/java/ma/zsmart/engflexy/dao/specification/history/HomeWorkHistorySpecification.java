package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.HomeWorkHistory;
import ma.zsmart.engflexy.dao.criteria.history.HomeWorkHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class HomeWorkHistorySpecification extends AbstractHistorySpecification<HomeWorkHistoryCriteria, HomeWorkHistory> {

    public HomeWorkHistorySpecification(HomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkHistorySpecification(HomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
