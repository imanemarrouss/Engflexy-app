package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Price;
import ma.zsmart.engflexy.dao.criteria.core.PriceCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class PriceSpecification extends  AbstractSpecification<PriceCriteria, Price>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("price", criteria.getPrice(), criteria.getPriceMin(), criteria.getPriceMax());
        addPredicateBigDecimal("oldPrice", criteria.getOldPrice(), criteria.getOldPriceMin(), criteria.getOldPriceMax());
        addPredicate("lib", criteria.getLib(),criteria.getLibLike());
        addPredicateBigDecimal("nreCourse", criteria.getNreCourse(), criteria.getNreCourseMin(), criteria.getNreCourseMax());
        addPredicateBigDecimal("nreHours", criteria.getNreHours(), criteria.getNreHoursMin(), criteria.getNreHoursMax());
        addPredicateBigDecimal("nreMonth", criteria.getNreMonth(), criteria.getNreMonthMin(), criteria.getNreMonthMax());
        addPredicateBool("forGroup", criteria.getForGroup());
    }

    public PriceSpecification(PriceCriteria criteria) {
        super(criteria);
    }

    public PriceSpecification(PriceCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
