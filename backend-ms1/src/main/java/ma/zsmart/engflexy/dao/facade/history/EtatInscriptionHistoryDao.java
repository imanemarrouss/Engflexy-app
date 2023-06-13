package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.EtatInscriptionHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatInscriptionHistoryDao extends AbstractHistoryRepository<EtatInscriptionHistory,Long> {

}
