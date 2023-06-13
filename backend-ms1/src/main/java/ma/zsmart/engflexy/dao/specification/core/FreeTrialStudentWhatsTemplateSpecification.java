package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.FreeTrialStudentWhatsTemplate;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialStudentWhatsTemplateCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FreeTrialStudentWhatsTemplateSpecification extends  AbstractSpecification<FreeTrialStudentWhatsTemplateCriteria, FreeTrialStudentWhatsTemplate>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(),criteria.getObjectLike());
        addPredicate("source", criteria.getSource(),criteria.getSourceLike());
    }

    public FreeTrialStudentWhatsTemplateSpecification(FreeTrialStudentWhatsTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentWhatsTemplateSpecification(FreeTrialStudentWhatsTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
