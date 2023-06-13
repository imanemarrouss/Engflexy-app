package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.TypeTeacher;
import ma.zsmart.engflexy.dao.criteria.core.TypeTeacherCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class TypeTeacherSpecification extends  AbstractSpecification<TypeTeacherCriteria, TypeTeacher>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public TypeTeacherSpecification(TypeTeacherCriteria criteria) {
        super(criteria);
    }

    public TypeTeacherSpecification(TypeTeacherCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
