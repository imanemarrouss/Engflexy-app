package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.EtatReponse;
import ma.zsmart.engflexy.bean.history.EtatReponseHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtatReponseCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtatReponseHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.EtatReponseDao;
import ma.zsmart.engflexy.dao.facade.history.EtatReponseHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.EtatReponseSpecification;
import ma.zsmart.engflexy.service.facade.admin.EtatReponseAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class EtatReponseAdminServiceImpl extends AbstractServiceImpl<EtatReponse,EtatReponseHistory, EtatReponseCriteria, EtatReponseHistoryCriteria, EtatReponseDao,
EtatReponseHistoryDao> implements EtatReponseAdminService {


    public EtatReponse findByReferenceEntity(EtatReponse t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(EtatReponse.class,EtatReponseHistory.class, EtatReponseHistoryCriteria.class, EtatReponseSpecification.class);
    }


    public EtatReponseAdminServiceImpl(EtatReponseDao dao, EtatReponseHistoryDao historyDao) {
        super(dao, historyDao);
    }

}