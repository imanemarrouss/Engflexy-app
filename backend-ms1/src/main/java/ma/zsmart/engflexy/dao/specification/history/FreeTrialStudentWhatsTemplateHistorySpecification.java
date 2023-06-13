package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FreeTrialStudentWhatsTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialStudentWhatsTemplateHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FreeTrialStudentWhatsTemplateHistorySpecification extends AbstractHistorySpecification<FreeTrialStudentWhatsTemplateHistoryCriteria, FreeTrialStudentWhatsTemplateHistory> {

    public FreeTrialStudentWhatsTemplateHistorySpecification(FreeTrialStudentWhatsTemplateHistoryCriteria criteria) {
        super(criteria);
    }

    public FreeTrialStudentWhatsTemplateHistorySpecification(FreeTrialStudentWhatsTemplateHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
