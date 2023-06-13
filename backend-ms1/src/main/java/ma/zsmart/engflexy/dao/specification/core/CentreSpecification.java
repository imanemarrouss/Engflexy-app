package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Centre;
import ma.zsmart.engflexy.dao.criteria.core.CentreCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class CentreSpecification extends  AbstractSpecification<CentreCriteria, Centre>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("description", criteria.getDescription(),criteria.getDescriptionLike());
        addPredicate("log", criteria.getLog(),criteria.getLogLike());
        addPredicate("password", criteria.getPassword(),criteria.getPasswordLike());
    }

    public CentreSpecification(CentreCriteria criteria) {
        super(criteria);
    }

    public CentreSpecification(CentreCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
