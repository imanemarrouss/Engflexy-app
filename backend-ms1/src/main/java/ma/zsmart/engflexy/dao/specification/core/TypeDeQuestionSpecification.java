package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.TypeDeQuestion;
import ma.zsmart.engflexy.dao.criteria.core.TypeDeQuestionCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class TypeDeQuestionSpecification extends  AbstractSpecification<TypeDeQuestionCriteria, TypeDeQuestion>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("lib", criteria.getLib(),criteria.getLibLike());
    }

    public TypeDeQuestionSpecification(TypeDeQuestionCriteria criteria) {
        super(criteria);
    }

    public TypeDeQuestionSpecification(TypeDeQuestionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
