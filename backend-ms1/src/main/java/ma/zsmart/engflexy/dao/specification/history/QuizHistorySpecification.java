package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.QuizHistory;
import ma.zsmart.engflexy.dao.criteria.history.QuizHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class QuizHistorySpecification extends AbstractHistorySpecification<QuizHistoryCriteria, QuizHistory> {

    public QuizHistorySpecification(QuizHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizHistorySpecification(QuizHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
