package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.FaqEtudiantHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqEtudiantHistoryDao extends AbstractHistoryRepository<FaqEtudiantHistory,Long> {

}
