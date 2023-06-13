package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.FreeTrialTeacherEmailTemplate;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialTeacherEmailTemplateCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FreeTrialTeacherEmailTemplateSpecification extends  AbstractSpecification<FreeTrialTeacherEmailTemplateCriteria, FreeTrialTeacherEmailTemplate>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(),criteria.getObjectLike());
        addPredicate("source", criteria.getSource(),criteria.getSourceLike());
    }

    public FreeTrialTeacherEmailTemplateSpecification(FreeTrialTeacherEmailTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherEmailTemplateSpecification(FreeTrialTeacherEmailTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
