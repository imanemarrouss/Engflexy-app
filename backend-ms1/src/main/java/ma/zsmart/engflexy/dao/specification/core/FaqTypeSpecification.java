package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.FaqType;
import ma.zsmart.engflexy.dao.criteria.core.FaqTypeCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FaqTypeSpecification extends  AbstractSpecification<FaqTypeCriteria, FaqType>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public FaqTypeSpecification(FaqTypeCriteria criteria) {
        super(criteria);
    }

    public FaqTypeSpecification(FaqTypeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
