package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Fonction;
import ma.zsmart.engflexy.dao.criteria.core.FonctionCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FonctionSpecification extends  AbstractSpecification<FonctionCriteria, Fonction>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public FonctionSpecification(FonctionCriteria criteria) {
        super(criteria);
    }

    public FonctionSpecification(FonctionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
