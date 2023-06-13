package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.EtatEtudiantScheduleHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatEtudiantScheduleHistoryDao extends AbstractHistoryRepository<EtatEtudiantScheduleHistory,Long> {

}
