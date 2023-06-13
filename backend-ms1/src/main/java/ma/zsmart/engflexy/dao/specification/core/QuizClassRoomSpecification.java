package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.QuizClassRoom;
import ma.zsmart.engflexy.dao.criteria.core.QuizClassRoomCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class QuizClassRoomSpecification extends  AbstractSpecification<QuizClassRoomCriteria, QuizClassRoom>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateFk("classRoom","id", criteria.getClassRoom()==null?null:criteria.getClassRoom().getId());
        addPredicateFk("classRoom","id", criteria.getClassRooms());
        addPredicateFk("quiz","id", criteria.getQuiz()==null?null:criteria.getQuiz().getId());
        addPredicateFk("quiz","id", criteria.getQuizs());
        addPredicateFk("quiz","ref", criteria.getQuiz()==null?null:criteria.getQuiz().getRef());
    }

    public QuizClassRoomSpecification(QuizClassRoomCriteria criteria) {
        super(criteria);
    }

    public QuizClassRoomSpecification(QuizClassRoomCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
