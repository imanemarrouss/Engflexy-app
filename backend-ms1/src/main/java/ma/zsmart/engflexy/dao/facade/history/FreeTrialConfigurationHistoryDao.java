package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.FreeTrialConfigurationHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialConfigurationHistoryDao extends AbstractHistoryRepository<FreeTrialConfigurationHistory,Long> {

}
