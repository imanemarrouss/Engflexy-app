package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.StatutSocial;
import ma.zsmart.engflexy.dao.criteria.core.StatutSocialCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class StatutSocialSpecification extends  AbstractSpecification<StatutSocialCriteria, StatutSocial>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public StatutSocialSpecification(StatutSocialCriteria criteria) {
        super(criteria);
    }

    public StatutSocialSpecification(StatutSocialCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
