package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.ClassRoomHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomHistoryDao extends AbstractHistoryRepository<ClassRoomHistory,Long> {

}
