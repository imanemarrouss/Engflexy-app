package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.WorkloadBonusProfHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkloadBonusProfHistoryDao extends AbstractHistoryRepository<WorkloadBonusProfHistory,Long> {

}
