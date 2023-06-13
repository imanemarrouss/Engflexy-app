package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.EtudiantClassRoomHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantClassRoomHistoryDao extends AbstractHistoryRepository<EtudiantClassRoomHistory,Long> {

}
