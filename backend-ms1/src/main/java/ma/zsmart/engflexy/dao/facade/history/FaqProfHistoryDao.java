package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.FaqProfHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaqProfHistoryDao extends AbstractHistoryRepository<FaqProfHistory,Long> {

}
