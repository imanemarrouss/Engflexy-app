package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialStudentEmailTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateHistory> {

    public FreeTrialStudentEmailTemplateHistorySpecification(FreeTrialStudentEmailTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentEmailTemplateHistorySpecification(FreeTrialStudentEmailTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
