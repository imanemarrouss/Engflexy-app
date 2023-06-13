package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.EtatInscription;
import ma.zsmart.engflexy.dao.criteria.core.EtatInscriptionCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class EtatInscriptionSpecification extends  AbstractSpecification<EtatInscriptionCriteria, EtatInscription>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public EtatInscriptionSpecification(EtatInscriptionCriteria criteria) {
        super(criteria);
    }

    public EtatInscriptionSpecification(EtatInscriptionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
