package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.SuperCategorieSectionHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperCategorieSectionHistoryDao extends AbstractHistoryRepository<SuperCategorieSectionHistory,Long> {

}
