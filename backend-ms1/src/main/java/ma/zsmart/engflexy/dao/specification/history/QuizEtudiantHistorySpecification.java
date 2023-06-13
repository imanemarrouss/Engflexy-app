package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.QuizEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.history.QuizEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class QuizEtudiantHistorySpecification extends AbstractHistorySpecification<QuizEtudiantHistoryCriteria, QuizEtudiantHistory> {

    public QuizEtudiantHistorySpecification(QuizEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public QuizEtudiantHistorySpecification(QuizEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
