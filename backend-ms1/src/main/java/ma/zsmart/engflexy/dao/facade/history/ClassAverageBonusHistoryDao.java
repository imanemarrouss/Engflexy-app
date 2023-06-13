package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.ClassAverageBonusHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassAverageBonusHistoryDao extends AbstractHistoryRepository<ClassAverageBonusHistory,Long> {

}
