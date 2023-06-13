package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.DictionaryHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictionaryHistoryDao extends AbstractHistoryRepository<DictionaryHistory,Long> {

}
