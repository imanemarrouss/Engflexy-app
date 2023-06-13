package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Price;
import ma.zsmart.engflexy.bean.history.PriceHistory;
import ma.zsmart.engflexy.dao.criteria.core.PriceCriteria;
import ma.zsmart.engflexy.dao.criteria.history.PriceHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.PriceDao;
import ma.zsmart.engflexy.dao.facade.history.PriceHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.PriceSpecification;
import ma.zsmart.engflexy.service.facade.admin.PriceAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class PriceAdminServiceImpl extends AbstractServiceImpl<Price,PriceHistory, PriceCriteria, PriceHistoryCriteria, PriceDao,
PriceHistoryDao> implements PriceAdminService {






    public void configure() {
        super.configure(Price.class,PriceHistory.class, PriceHistoryCriteria.class, PriceSpecification.class);
    }


    public PriceAdminServiceImpl(PriceDao dao, PriceHistoryDao historyDao) {
        super(dao, historyDao);
    }

}