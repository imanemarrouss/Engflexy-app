package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialTeacherEmailTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateHistory> {

    public FreeTrialTeacherEmailTemplateHistorySpecification(FreeTrialTeacherEmailTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialTeacherEmailTemplateHistorySpecification(FreeTrialTeacherEmailTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
