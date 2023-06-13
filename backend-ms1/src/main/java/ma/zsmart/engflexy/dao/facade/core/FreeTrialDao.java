package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.FreeTrial;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FreeTrialDao extends AbstractRepository<FreeTrial,Long>  {
    FreeTrial findByReference(String reference);
    int deleteByReference(String reference);

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

    @Query("SELECT NEW FreeTrial(item.id,item.reference) FROM FreeTrial item")
    List<FreeTrial> findAllOptimized();
}
