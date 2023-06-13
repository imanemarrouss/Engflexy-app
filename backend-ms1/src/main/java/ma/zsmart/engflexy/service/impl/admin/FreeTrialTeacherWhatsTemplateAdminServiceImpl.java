package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.FreeTrialTeacherWhatsTemplate;
import ma.zsmart.engflexy.bean.history.FreeTrialTeacherWhatsTemplateHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialTeacherWhatsTemplateCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialTeacherWhatsTemplateHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.FreeTrialTeacherWhatsTemplateDao;
import ma.zsmart.engflexy.dao.facade.history.FreeTrialTeacherWhatsTemplateHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.FreeTrialTeacherWhatsTemplateSpecification;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialTeacherWhatsTemplateAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class FreeTrialTeacherWhatsTemplateAdminServiceImpl extends AbstractServiceImpl<FreeTrialTeacherWhatsTemplate,FreeTrialTeacherWhatsTemplateHistory, FreeTrialTeacherWhatsTemplateCriteria, FreeTrialTeacherWhatsTemplateHistoryCriteria, FreeTrialTeacherWhatsTemplateDao,
FreeTrialTeacherWhatsTemplateHistoryDao> implements FreeTrialTeacherWhatsTemplateAdminService {






    public void configure() {
        super.configure(FreeTrialTeacherWhatsTemplate.class,FreeTrialTeacherWhatsTemplateHistory.class, FreeTrialTeacherWhatsTemplateHistoryCriteria.class, FreeTrialTeacherWhatsTemplateSpecification.class);
    }


    public FreeTrialTeacherWhatsTemplateAdminServiceImpl(FreeTrialTeacherWhatsTemplateDao dao, FreeTrialTeacherWhatsTemplateHistoryDao historyDao) {
        super(dao, historyDao);
    }

}