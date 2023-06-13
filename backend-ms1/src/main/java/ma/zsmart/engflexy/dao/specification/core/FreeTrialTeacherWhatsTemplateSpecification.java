package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.FreeTrialTeacherWhatsTemplate;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialTeacherWhatsTemplateCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FreeTrialTeacherWhatsTemplateSpecification extends  AbstractSpecification<FreeTrialTeacherWhatsTemplateCriteria, FreeTrialTeacherWhatsTemplate>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("object", criteria.getObject(),criteria.getObjectLike());
        addPredicate("source", criteria.getSource(),criteria.getSourceLike());
    }

    public FreeTrialTeacherWhatsTemplateSpecification(FreeTrialTeacherWhatsTemplateCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherWhatsTemplateSpecification(FreeTrialTeacherWhatsTemplateCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
