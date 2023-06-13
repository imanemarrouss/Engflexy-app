package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.StatutSocialHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatutSocialHistoryDao extends AbstractHistoryRepository<StatutSocialHistory,Long> {

}
