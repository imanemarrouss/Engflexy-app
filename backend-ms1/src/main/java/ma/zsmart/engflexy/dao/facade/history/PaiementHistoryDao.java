package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.PaiementHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementHistoryDao extends AbstractHistoryRepository<PaiementHistory,Long> {

}
