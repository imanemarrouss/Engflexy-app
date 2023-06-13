package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.ReponseEtudiantHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseEtudiantHistoryDao extends AbstractHistoryRepository<ReponseEtudiantHistory,Long> {

}
