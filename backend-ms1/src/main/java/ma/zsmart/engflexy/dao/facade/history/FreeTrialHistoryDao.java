package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.FreeTrialHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialHistoryDao extends AbstractHistoryRepository<FreeTrialHistory,Long> {

}
