package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.StatutSocial;
import ma.zsmart.engflexy.bean.history.StatutSocialHistory;
import ma.zsmart.engflexy.dao.criteria.core.StatutSocialCriteria;
import ma.zsmart.engflexy.dao.criteria.history.StatutSocialHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.StatutSocialDao;
import ma.zsmart.engflexy.dao.facade.history.StatutSocialHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.StatutSocialSpecification;
import ma.zsmart.engflexy.service.facade.admin.StatutSocialAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class StatutSocialAdminServiceImpl extends AbstractServiceImpl<StatutSocial,StatutSocialHistory, StatutSocialCriteria, StatutSocialHistoryCriteria, StatutSocialDao,
StatutSocialHistoryDao> implements StatutSocialAdminService {


    public StatutSocial findByReferenceEntity(StatutSocial t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(StatutSocial.class,StatutSocialHistory.class, StatutSocialHistoryCriteria.class, StatutSocialSpecification.class);
    }


    public StatutSocialAdminServiceImpl(StatutSocialDao dao, StatutSocialHistoryDao historyDao) {
        super(dao, historyDao);
    }

}