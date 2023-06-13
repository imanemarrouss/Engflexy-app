package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.TypeTeacherHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeTeacherHistoryDao extends AbstractHistoryRepository<TypeTeacherHistory,Long> {

}
