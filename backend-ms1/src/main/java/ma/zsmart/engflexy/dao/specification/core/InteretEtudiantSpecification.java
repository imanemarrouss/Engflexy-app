package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.InteretEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.InteretEtudiantCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class InteretEtudiantSpecification extends  AbstractSpecification<InteretEtudiantCriteria, InteretEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public InteretEtudiantSpecification(InteretEtudiantCriteria criteria) {
        super(criteria);
    }

    public InteretEtudiantSpecification(InteretEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
