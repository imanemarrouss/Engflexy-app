package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Langue;
import ma.zsmart.engflexy.bean.history.LangueHistory;
import ma.zsmart.engflexy.dao.criteria.core.LangueCriteria;
import ma.zsmart.engflexy.dao.criteria.history.LangueHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.LangueDao;
import ma.zsmart.engflexy.dao.facade.history.LangueHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.LangueSpecification;
import ma.zsmart.engflexy.service.facade.admin.LangueAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class LangueAdminServiceImpl extends AbstractServiceImpl<Langue,LangueHistory, LangueCriteria, LangueHistoryCriteria, LangueDao,
LangueHistoryDao> implements LangueAdminService {


    public Langue findByReferenceEntity(Langue t){
        return  dao.findByLibelle(t.getLibelle());
    }




    public void configure() {
        super.configure(Langue.class,LangueHistory.class, LangueHistoryCriteria.class, LangueSpecification.class);
    }


    public LangueAdminServiceImpl(LangueDao dao, LangueHistoryDao historyDao) {
        super(dao, historyDao);
    }

}