package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.WorkloadBonus;
import ma.zsmart.engflexy.bean.history.WorkloadBonusHistory;
import ma.zsmart.engflexy.dao.criteria.core.WorkloadBonusCriteria;
import ma.zsmart.engflexy.dao.criteria.history.WorkloadBonusHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.WorkloadBonusDao;
import ma.zsmart.engflexy.dao.facade.history.WorkloadBonusHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.WorkloadBonusSpecification;
import ma.zsmart.engflexy.service.facade.admin.WorkloadBonusAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class WorkloadBonusAdminServiceImpl extends AbstractServiceImpl<WorkloadBonus,WorkloadBonusHistory, WorkloadBonusCriteria, WorkloadBonusHistoryCriteria, WorkloadBonusDao,
WorkloadBonusHistoryDao> implements WorkloadBonusAdminService {


    public WorkloadBonus findByReferenceEntity(WorkloadBonus t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(WorkloadBonus.class,WorkloadBonusHistory.class, WorkloadBonusHistoryCriteria.class, WorkloadBonusSpecification.class);
    }


    public WorkloadBonusAdminServiceImpl(WorkloadBonusDao dao, WorkloadBonusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}