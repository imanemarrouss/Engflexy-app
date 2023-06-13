package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.NiveauEtudeHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauEtudeHistoryDao extends AbstractHistoryRepository<NiveauEtudeHistory,Long> {

}
