package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Services;
import ma.zsmart.engflexy.dao.criteria.core.ServicesCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecificationEnhanced;

public class ServicesSpecification extends  AbstractSpecificationEnhanced<ServicesCriteria, Services>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public ServicesSpecification(ServicesCriteria criteria) {
        super(criteria);
    }

    public ServicesSpecification(ServicesCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
