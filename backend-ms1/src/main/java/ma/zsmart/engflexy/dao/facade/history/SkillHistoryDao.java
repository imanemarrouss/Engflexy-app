package ma.zsmart.engflexy.dao.facade.history;

import ma.zsmart.engflexy.bean.history.SkillHistory;
import ma.zsmart.engflexy.zynerator.repository.AbstractHistoryRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillHistoryDao extends AbstractHistoryRepository<SkillHistory,Long> {

}
