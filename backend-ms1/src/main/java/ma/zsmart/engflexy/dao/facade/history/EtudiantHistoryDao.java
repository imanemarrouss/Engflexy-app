package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.EtudiantHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantHistoryDao extends AbstractHistoryRepository<EtudiantHistory,Long> {

}
