package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.ReclamationProfHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReclamationProfHistoryDao extends AbstractHistoryRepository<ReclamationProfHistory,Long> {

}
