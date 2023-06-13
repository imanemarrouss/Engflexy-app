package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.TeacherLocality;
import ma.zsmart.engflexy.dao.criteria.core.TeacherLocalityCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecificationEnhanced;

public class TeacherLocalitySpecification extends  AbstractSpecificationEnhanced<TeacherLocalityCriteria, TeacherLocality>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public TeacherLocalitySpecification(TeacherLocalityCriteria criteria) {
        super(criteria);
    }

    public TeacherLocalitySpecification(TeacherLocalityCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
