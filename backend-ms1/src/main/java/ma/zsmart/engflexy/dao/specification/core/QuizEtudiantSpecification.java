package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.QuizEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.QuizEtudiantCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class QuizEtudiantSpecification extends  AbstractSpecification<QuizEtudiantCriteria, QuizEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicateBigDecimal("note", criteria.getNote(), criteria.getNoteMin(), criteria.getNoteMax());
        addPredicate("resultat", criteria.getResultat(),criteria.getResultatLike());
        addPredicateLong("questionCurrent", criteria.getQuestionCurrent(), criteria.getQuestionCurrentMin(), criteria.getQuestionCurrentMax());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
        addPredicateFk("quiz","id", criteria.getQuiz()==null?null:criteria.getQuiz().getId());
        addPredicateFk("quiz","id", criteria.getQuizs());
        addPredicateFk("quiz","ref", criteria.getQuiz()==null?null:criteria.getQuiz().getRef());
    }

    public QuizEtudiantSpecification(QuizEtudiantCriteria criteria) {
        super(criteria);
    }

    public QuizEtudiantSpecification(QuizEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
