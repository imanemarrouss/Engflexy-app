package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Faq;
import ma.zsmart.engflexy.dao.criteria.core.FaqCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FaqSpecification extends  AbstractSpecification<FaqCriteria, Faq>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateFk("faqType","id", criteria.getFaqType()==null?null:criteria.getFaqType().getId());
        addPredicateFk("faqType","id", criteria.getFaqTypes());
    }

    public FaqSpecification(FaqCriteria criteria) {
        super(criteria);
    }

    public FaqSpecification(FaqCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
