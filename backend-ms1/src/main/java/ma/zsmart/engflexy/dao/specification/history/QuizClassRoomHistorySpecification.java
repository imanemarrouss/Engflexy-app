package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.QuizClassRoomHistory;
import ma.zsmart.engflexy.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class QuizClassRoomHistorySpecification extends AbstractHistorySpecification<QuizClassRoomHistoryCriteria, QuizClassRoomHistory> {

    public QuizClassRoomHistorySpecification(QuizClassRoomHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizClassRoomHistorySpecification(QuizClassRoomHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
