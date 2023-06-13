package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.FaqProf;
import ma.zsmart.engflexy.dao.criteria.core.FaqProfCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FaqProfSpecification extends  AbstractSpecification<FaqProfCriteria, FaqProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("admin","id", criteria.getAdmin()==null?null:criteria.getAdmin().getId());
        addPredicateFk("admin","id", criteria.getAdmins());
        addPredicateFk("faqType","id", criteria.getFaqType()==null?null:criteria.getFaqType().getId());
        addPredicateFk("faqType","id", criteria.getFaqTypes());
    }

    public FaqProfSpecification(FaqProfCriteria criteria) {
        super(criteria);
    }

    public FaqProfSpecification(FaqProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
