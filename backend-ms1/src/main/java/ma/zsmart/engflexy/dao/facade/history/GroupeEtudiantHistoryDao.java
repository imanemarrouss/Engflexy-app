package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.GroupeEtudiantHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeEtudiantHistoryDao extends AbstractHistoryRepository<GroupeEtudiantHistory,Long> {

}
