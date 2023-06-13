package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.NiveauEtude;
import ma.zsmart.engflexy.dao.criteria.core.NiveauEtudeCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class NiveauEtudeSpecification extends  AbstractSpecification<NiveauEtudeCriteria, NiveauEtude>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public NiveauEtudeSpecification(NiveauEtudeCriteria criteria) {
        super(criteria);
    }

    public NiveauEtudeSpecification(NiveauEtudeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
