package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.GroupeEtudeHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeEtudeHistoryDao extends AbstractHistoryRepository<GroupeEtudeHistory,Long> {

}
