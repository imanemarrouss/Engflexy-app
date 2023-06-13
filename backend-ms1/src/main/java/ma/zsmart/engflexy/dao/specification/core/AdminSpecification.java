package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Admin;
import ma.zsmart.engflexy.dao.criteria.core.AdminCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class AdminSpecification extends  AbstractSpecification<AdminCriteria, Admin>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("description", criteria.getDescription(),criteria.getDescriptionLike());
    }

    public AdminSpecification(AdminCriteria criteria) {
        super(criteria);
    }

    public AdminSpecification(AdminCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
