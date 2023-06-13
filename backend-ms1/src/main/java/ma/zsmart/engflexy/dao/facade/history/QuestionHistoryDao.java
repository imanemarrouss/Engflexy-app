package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.QuestionHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionHistoryDao extends AbstractHistoryRepository<QuestionHistory,Long> {

}
