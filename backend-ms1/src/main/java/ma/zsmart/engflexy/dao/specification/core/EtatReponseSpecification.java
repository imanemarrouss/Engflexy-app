package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.EtatReponse;
import ma.zsmart.engflexy.dao.criteria.core.EtatReponseCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class EtatReponseSpecification extends  AbstractSpecification<EtatReponseCriteria, EtatReponse>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public EtatReponseSpecification(EtatReponseCriteria criteria) {
        super(criteria);
    }

    public EtatReponseSpecification(EtatReponseCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
