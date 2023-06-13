package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Prof;
import ma.zsmart.engflexy.dao.criteria.core.ProfCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class ProfSpecification extends  AbstractSpecification<ProfCriteria, Prof>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("about", criteria.getAbout(),criteria.getAboutLike());
        addPredicate("email", criteria.getEmail(),criteria.getEmailLike());
        addPredicateFk("parcours","id", criteria.getParcours()==null?null:criteria.getParcours().getId());
        addPredicateFk("parcours","id", criteria.getParcourss());
        addPredicateFk("parcours","code", criteria.getParcours()==null?null:criteria.getParcours().getCode());
        addPredicateFk("categorieProf","id", criteria.getCategorieProf()==null?null:criteria.getCategorieProf().getId());
        addPredicateFk("categorieProf","id", criteria.getCategorieProfs());
        addPredicateFk("categorieProf","code", criteria.getCategorieProf()==null?null:criteria.getCategorieProf().getCode());
        addPredicateFk("typeTeacher","id", criteria.getTypeTeacher()==null?null:criteria.getTypeTeacher().getId());
        addPredicateFk("typeTeacher","id", criteria.getTypeTeachers());
        addPredicateFk("typeTeacher","code", criteria.getTypeTeacher()==null?null:criteria.getTypeTeacher().getCode());
    }

    public ProfSpecification(ProfCriteria criteria) {
        super(criteria);
    }

    public ProfSpecification(ProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
