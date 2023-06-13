package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.WorkloadBonusHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkloadBonusHistoryDao extends AbstractHistoryRepository<WorkloadBonusHistory,Long> {

}
