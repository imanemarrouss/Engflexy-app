package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.ContactHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactHistoryDao extends AbstractHistoryRepository<ContactHistory,Long> {

}
