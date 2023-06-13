package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.FreeTrial;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface FreeTrialAdminService extends  IService<FreeTrial,FreeTrialCriteria, FreeTrialHistoryCriteria>  {

    List<FreeTrial> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<FreeTrial> findByNiveauEtudeId(Long id);
    int deleteByNiveauEtudeId(Long id);
    List<FreeTrial> findByFreeTrialStudentWhatsTemplateId(Long id);
    int deleteByFreeTrialStudentWhatsTemplateId(Long id);
    List<FreeTrial> findByFreeTrialStudentEmailTemplateId(Long id);
    int deleteByFreeTrialStudentEmailTemplateId(Long id);
    List<FreeTrial> findByFreeTrialTeacherEmailTemplateId(Long id);
    int deleteByFreeTrialTeacherEmailTemplateId(Long id);
    List<FreeTrial> findByFreeTrialTeacherWhatsTemplateId(Long id);
    int deleteByFreeTrialTeacherWhatsTemplateId(Long id);
    List<FreeTrial> findByFreeTrialConfigurationId(Long id);
    int deleteByFreeTrialConfigurationId(Long id);
    List<FreeTrial> findByStatutFreeTrialId(Long id);
    int deleteByStatutFreeTrialId(Long id);



}
