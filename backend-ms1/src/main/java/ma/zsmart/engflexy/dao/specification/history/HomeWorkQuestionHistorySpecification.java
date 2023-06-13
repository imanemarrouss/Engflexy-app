package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.HomeWorkQuestionHistory;
import ma.zsmart.engflexy.dao.criteria.history.HomeWorkQuestionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class HomeWorkQuestionHistorySpecification extends AbstractHistorySpecification<HomeWorkQuestionHistoryCriteria, HomeWorkQuestionHistory> {

    public HomeWorkQuestionHistorySpecification(HomeWorkQuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkQuestionHistorySpecification(HomeWorkQuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
