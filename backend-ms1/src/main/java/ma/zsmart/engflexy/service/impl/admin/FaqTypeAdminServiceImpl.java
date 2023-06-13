package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.FaqType;
import ma.zsmart.engflexy.bean.history.FaqTypeHistory;
import ma.zsmart.engflexy.dao.criteria.core.FaqTypeCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FaqTypeHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.FaqTypeDao;
import ma.zsmart.engflexy.dao.facade.history.FaqTypeHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.FaqTypeSpecification;
import ma.zsmart.engflexy.service.facade.admin.FaqTypeAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class FaqTypeAdminServiceImpl extends AbstractServiceImpl<FaqType,FaqTypeHistory, FaqTypeCriteria, FaqTypeHistoryCriteria, FaqTypeDao,
FaqTypeHistoryDao> implements FaqTypeAdminService {






    public void configure() {
        super.configure(FaqType.class,FaqTypeHistory.class, FaqTypeHistoryCriteria.class, FaqTypeSpecification.class);
    }


    public FaqTypeAdminServiceImpl(FaqTypeDao dao, FaqTypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}