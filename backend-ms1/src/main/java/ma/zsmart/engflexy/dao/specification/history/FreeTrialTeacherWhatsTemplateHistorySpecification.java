package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FreeTrialTeacherWhatsTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialTeacherWhatsTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateHistory> {

    public FreeTrialTeacherWhatsTemplateHistorySpecification(FreeTrialTeacherWhatsTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherWhatsTemplateHistorySpecification(FreeTrialTeacherWhatsTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
