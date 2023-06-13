package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.CentreHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CentreHistoryDao extends AbstractHistoryRepository<CentreHistory,Long> {

}
