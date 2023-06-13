package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Admin;
import ma.zsmart.engflexy.bean.history.AdminHistory;
import ma.zsmart.engflexy.dao.criteria.core.AdminCriteria;
import ma.zsmart.engflexy.dao.criteria.history.AdminHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.AdminDao;
import ma.zsmart.engflexy.dao.facade.history.AdminHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.AdminSpecification;
import ma.zsmart.engflexy.service.facade.admin.AdminAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class AdminAdminServiceImpl extends AbstractServiceImpl<Admin,AdminHistory, AdminCriteria, AdminHistoryCriteria, AdminDao,
AdminHistoryDao> implements AdminAdminService {






    public void configure() {
        super.configure(Admin.class,AdminHistory.class, AdminHistoryCriteria.class, AdminSpecification.class);
    }


    public AdminAdminServiceImpl(AdminDao dao, AdminHistoryDao historyDao) {
        super(dao, historyDao);
    }

}