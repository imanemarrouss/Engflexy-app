package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.TypeReclamationProf;
import ma.zsmart.engflexy.dao.criteria.core.TypeReclamationProfCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class TypeReclamationProfSpecification extends  AbstractSpecification<TypeReclamationProfCriteria, TypeReclamationProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public TypeReclamationProfSpecification(TypeReclamationProfCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationProfSpecification(TypeReclamationProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
