package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.WorkloadBonusProf;
import ma.zsmart.engflexy.bean.history.WorkloadBonusProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.WorkloadBonusProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.WorkloadBonusProfDao;
import ma.zsmart.engflexy.dao.facade.history.WorkloadBonusProfHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.WorkloadBonusProfSpecification;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.service.facade.admin.SalaryAdminService;
import ma.zsmart.engflexy.service.facade.admin.WorkloadBonusAdminService;
import ma.zsmart.engflexy.service.facade.admin.WorkloadBonusProfAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WorkloadBonusProfAdminServiceImpl extends AbstractServiceImpl<WorkloadBonusProf,WorkloadBonusProfHistory, WorkloadBonusProfCriteria, WorkloadBonusProfHistoryCriteria, WorkloadBonusProfDao,
WorkloadBonusProfHistoryDao> implements WorkloadBonusProfAdminService {



    public List<WorkloadBonusProf> findByWorkloadBonusId(Long id){
        return dao.findByWorkloadBonusId(id);
    }
    public int deleteByWorkloadBonusId(Long id){
        return dao.deleteByWorkloadBonusId(id);
    }
    public List<WorkloadBonusProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<WorkloadBonusProf> findBySalaryId(Long id){
        return dao.findBySalaryId(id);
    }
    public int deleteBySalaryId(Long id){
        return dao.deleteBySalaryId(id);
    }



    public void configure() {
        super.configure(WorkloadBonusProf.class,WorkloadBonusProfHistory.class, WorkloadBonusProfHistoryCriteria.class, WorkloadBonusProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private WorkloadBonusAdminService workloadBonusService ;
    @Autowired
    private SalaryAdminService salaryService ;

    public WorkloadBonusProfAdminServiceImpl(WorkloadBonusProfDao dao, WorkloadBonusProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}