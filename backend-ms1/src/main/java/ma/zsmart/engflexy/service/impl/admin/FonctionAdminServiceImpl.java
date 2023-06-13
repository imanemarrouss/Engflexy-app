package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Fonction;
import ma.zsmart.engflexy.bean.history.FonctionHistory;
import ma.zsmart.engflexy.dao.criteria.core.FonctionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FonctionHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.FonctionDao;
import ma.zsmart.engflexy.dao.facade.history.FonctionHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.FonctionSpecification;
import ma.zsmart.engflexy.service.facade.admin.FonctionAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class FonctionAdminServiceImpl extends AbstractServiceImpl<Fonction,FonctionHistory, FonctionCriteria, FonctionHistoryCriteria, FonctionDao,
FonctionHistoryDao> implements FonctionAdminService {


    public Fonction findByReferenceEntity(Fonction t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Fonction.class,FonctionHistory.class, FonctionHistoryCriteria.class, FonctionSpecification.class);
    }


    public FonctionAdminServiceImpl(FonctionDao dao, FonctionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}