package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.FreeTrialTeacherEmailTemplate;
import ma.zsmart.engflexy.bean.history.FreeTrialTeacherEmailTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialTeacherEmailTemplateCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialTeacherEmailTemplateHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.FreeTrialTeacherEmailTemplateDao;
import ma.zsmart.engflexy.dao.facade.history.FreeTrialTeacherEmailTemplateHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.FreeTrialTeacherEmailTemplateSpecification;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialTeacherEmailTemplateAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class FreeTrialTeacherEmailTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialTeacherEmailTemplate,FreeTrialTeacherEmailTemplateHistory, FreeTrialTeacherEmailTemplateCriteria, FreeTrialTeacherEmailTemplateHistoryCriteria, FreeTrialTeacherEmailTemplateDao,
FreeTrialTeacherEmailTemplateHistoryDao> implements FreeTrialTeacherEmailTemplateAdminService {






    public void configure() {
        super.configure(FreeTrialTeacherEmailTemplate.class,FreeTrialTeacherEmailTemplateHistory.class, FreeTrialTeacherEmailTemplateHistoryCriteria.class, FreeTrialTeacherEmailTemplateSpecification.class);
    }


    public FreeTrialTeacherEmailTemplateAdminServiceImpl(FreeTrialTeacherEmailTemplateDao dao, FreeTrialTeacherEmailTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}