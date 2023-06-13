package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Skill;
import ma.zsmart.engflexy.bean.history.SkillHistory;
import ma.zsmart.engflexy.dao.criteria.core.SkillCriteria;
import ma.zsmart.engflexy.dao.criteria.history.SkillHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.SkillDao;
import ma.zsmart.engflexy.dao.facade.history.SkillHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.SkillSpecification;
import ma.zsmart.engflexy.service.facade.admin.SkillAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class SkillAdminServiceImpl extends AbstractServiceImpl<Skill,SkillHistory, SkillCriteria, SkillHistoryCriteria, SkillDao,
SkillHistoryDao> implements SkillAdminService {


    public Skill findByReferenceEntity(Skill t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Skill.class,SkillHistory.class, SkillHistoryCriteria.class, SkillSpecification.class);
    }


    public SkillAdminServiceImpl(SkillDao dao, SkillHistoryDao historyDao) {
        super(dao, historyDao);
    }

}