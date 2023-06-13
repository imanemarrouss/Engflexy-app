package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.AdminHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminHistoryDao extends AbstractHistoryRepository<AdminHistory,Long> {

}
