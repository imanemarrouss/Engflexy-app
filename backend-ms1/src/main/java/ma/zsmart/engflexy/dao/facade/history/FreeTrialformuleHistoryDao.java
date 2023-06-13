package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.FreeTrialformuleHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeTrialformuleHistoryDao extends AbstractHistoryRepository<FreeTrialformuleHistory,Long> {

}
