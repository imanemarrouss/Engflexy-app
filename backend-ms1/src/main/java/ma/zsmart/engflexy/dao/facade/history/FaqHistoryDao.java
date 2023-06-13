package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.FaqHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqHistoryDao extends AbstractHistoryRepository<FaqHistory,Long> {

}
