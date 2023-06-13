package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.TypeDeQuestionHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeDeQuestionHistoryDao extends AbstractHistoryRepository<TypeDeQuestionHistory,Long> {

}
