package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.FreeTrialStudentEmailTemplate;
import ma.zsmart.engflexy.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialStudentEmailTemplateCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialStudentEmailTemplateHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.FreeTrialStudentEmailTemplateDao;
import ma.zsmart.engflexy.dao.facade.history.FreeTrialStudentEmailTemplateHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.FreeTrialStudentEmailTemplateSpecification;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialStudentEmailTemplateAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class FreeTrialStudentEmailTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialStudentEmailTemplate,FreeTrialStudentEmailTemplateHistory, FreeTrialStudentEmailTemplateCriteria, FreeTrialStudentEmailTemplateHistoryCriteria, FreeTrialStudentEmailTemplateDao,
FreeTrialStudentEmailTemplateHistoryDao> implements FreeTrialStudentEmailTemplateAdminService {






    public void configure() {
        super.configure(FreeTrialStudentEmailTemplate.class,FreeTrialStudentEmailTemplateHistory.class, FreeTrialStudentEmailTemplateHistoryCriteria.class, FreeTrialStudentEmailTemplateSpecification.class);
    }


    public FreeTrialStudentEmailTemplateAdminServiceImpl(FreeTrialStudentEmailTemplateDao dao, FreeTrialStudentEmailTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}