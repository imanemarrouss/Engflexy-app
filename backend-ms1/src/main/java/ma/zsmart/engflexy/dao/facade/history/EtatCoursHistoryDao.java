package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.EtatCoursHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtatCoursHistoryDao extends AbstractHistoryRepository<EtatCoursHistory,Long> {

}
