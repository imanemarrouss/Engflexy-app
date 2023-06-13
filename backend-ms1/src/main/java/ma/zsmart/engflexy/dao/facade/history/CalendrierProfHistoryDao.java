package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.CalendrierProfHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendrierProfHistoryDao extends AbstractHistoryRepository<CalendrierProfHistory,Long> {

}
