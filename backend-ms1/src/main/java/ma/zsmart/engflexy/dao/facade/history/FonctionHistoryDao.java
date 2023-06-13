package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.FonctionHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FonctionHistoryDao extends AbstractHistoryRepository<FonctionHistory,Long> {

}
