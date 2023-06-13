package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.CategorieSectionHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieSectionHistoryDao extends AbstractHistoryRepository<CategorieSectionHistory,Long> {

}
