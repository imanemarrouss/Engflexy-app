package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.EtatReponseHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatReponseHistoryDao extends AbstractHistoryRepository<EtatReponseHistory,Long> {

}
