package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.FreeTrialformule;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialformuleCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FreeTrialformuleSpecification extends  AbstractSpecification<FreeTrialformuleCriteria, FreeTrialformule>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("dayspeerweek", criteria.getDayspeerweek(),criteria.getDayspeerweekLike());
        addPredicate("timeperday", criteria.getTimeperday(),criteria.getTimeperdayLike());
        addPredicate("teacherGenderoption", criteria.getTeacherGenderoption(),criteria.getTeacherGenderoptionLike());
        addPredicate("teacherAgeRange", criteria.getTeacherAgeRange(),criteria.getTeacherAgeRangeLike());
        addPredicate("teacherPersonnality", criteria.getTeacherPersonnality(),criteria.getTeacherPersonnalityLike());
        addPredicateBool("status", criteria.getStatus());
        addPredicate("dateConfirmation", criteria.getDateConfirmation(), criteria.getDateConfirmationFrom(), criteria.getDateConfirmationTo());
        addPredicateFk("inscription","id", criteria.getInscription()==null?null:criteria.getInscription().getId());
        addPredicateFk("inscription","id", criteria.getInscriptions());
    }

    public FreeTrialformuleSpecification(FreeTrialformuleCriteria criteria) {
        super(criteria);
    }

    public FreeTrialformuleSpecification(FreeTrialformuleCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
