package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Langue;
import ma.zsmart.engflexy.dao.criteria.core.LangueCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class LangueSpecification extends  AbstractSpecification<LangueCriteria, Langue>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public LangueSpecification(LangueCriteria criteria) {
        super(criteria);
    }

    public LangueSpecification(LangueCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
