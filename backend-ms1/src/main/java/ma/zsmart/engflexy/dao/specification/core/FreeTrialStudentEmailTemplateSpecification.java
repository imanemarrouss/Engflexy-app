package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.FreeTrialStudentEmailTemplate;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialStudentEmailTemplateCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FreeTrialStudentEmailTemplateSpecification extends  AbstractSpecification<FreeTrialStudentEmailTemplateCriteria, FreeTrialStudentEmailTemplate>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(),criteria.getObjectLike());
        addPredicate("source", criteria.getSource(),criteria.getSourceLike());
    }

    public FreeTrialStudentEmailTemplateSpecification(FreeTrialStudentEmailTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentEmailTemplateSpecification(FreeTrialStudentEmailTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
