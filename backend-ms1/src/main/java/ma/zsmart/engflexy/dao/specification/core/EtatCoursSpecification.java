package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.EtatCours;
import ma.zsmart.engflexy.dao.criteria.core.EtatCoursCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class EtatCoursSpecification extends  AbstractSpecification<EtatCoursCriteria, EtatCours>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public EtatCoursSpecification(EtatCoursCriteria criteria) {
        super(criteria);
    }

    public EtatCoursSpecification(EtatCoursCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
