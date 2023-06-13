package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.SalaryHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryHistoryDao extends AbstractHistoryRepository<SalaryHistory,Long> {

}
