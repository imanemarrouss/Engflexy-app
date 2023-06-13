package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.ClassAverageBonusProfHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassAverageBonusProfHistoryDao extends AbstractHistoryRepository<ClassAverageBonusProfHistory,Long> {

}
