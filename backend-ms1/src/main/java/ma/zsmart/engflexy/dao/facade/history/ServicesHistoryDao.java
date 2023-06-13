package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.ServicesHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicesHistoryDao extends AbstractHistoryRepository<ServicesHistory,Long> {

}
