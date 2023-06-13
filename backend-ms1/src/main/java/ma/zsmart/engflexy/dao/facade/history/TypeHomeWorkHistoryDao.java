package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.TypeHomeWorkHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeHomeWorkHistoryDao extends AbstractHistoryRepository<TypeHomeWorkHistory,Long> {

}
