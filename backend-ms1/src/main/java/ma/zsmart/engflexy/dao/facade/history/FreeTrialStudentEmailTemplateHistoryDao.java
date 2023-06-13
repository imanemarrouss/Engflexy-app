package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.FreeTrialStudentEmailTemplateHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialStudentEmailTemplateHistoryDao extends AbstractHistoryRepository<FreeTrialStudentEmailTemplateHistory,Long> {

}
