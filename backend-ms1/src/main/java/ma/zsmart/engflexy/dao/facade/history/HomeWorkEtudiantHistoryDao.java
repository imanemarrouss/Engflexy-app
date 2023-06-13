package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.HomeWorkEtudiantHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeWorkEtudiantHistoryDao extends AbstractHistoryRepository<HomeWorkEtudiantHistory,Long> {

}
