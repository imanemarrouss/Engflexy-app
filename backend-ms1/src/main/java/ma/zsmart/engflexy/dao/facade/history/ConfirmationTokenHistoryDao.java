package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.ConfirmationTokenHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationTokenHistoryDao extends AbstractHistoryRepository<ConfirmationTokenHistory,Long> {

}
