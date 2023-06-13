package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.QuestionHistory;
import ma.zsmart.engflexy.dao.criteria.history.QuestionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class QuestionHistorySpecification extends AbstractHistorySpecification<QuestionHistoryCriteria, QuestionHistory> {

    public QuestionHistorySpecification(QuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public QuestionHistorySpecification(QuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
