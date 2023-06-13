package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.StatutFreeTrial;
import ma.zsmart.engflexy.dao.criteria.core.StatutFreeTrialCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class StatutFreeTrialSpecification extends  AbstractSpecification<StatutFreeTrialCriteria, StatutFreeTrial>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("style", criteria.getStyle(),criteria.getStyleLike());
    }

    public StatutFreeTrialSpecification(StatutFreeTrialCriteria criteria) {
        super(criteria);
    }

    public StatutFreeTrialSpecification(StatutFreeTrialCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
