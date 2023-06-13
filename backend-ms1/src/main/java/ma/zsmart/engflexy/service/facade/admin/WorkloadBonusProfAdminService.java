package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.WorkloadBonusProf;
import ma.zsmart.engflexy.dao.criteria.core.WorkloadBonusProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface WorkloadBonusProfAdminService extends  IService<WorkloadBonusProf,WorkloadBonusProfCriteria, WorkloadBonusProfHistoryCriteria>  {

    List<WorkloadBonusProf> findByWorkloadBonusId(Long id);
    int deleteByWorkloadBonusId(Long id);
    List<WorkloadBonusProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<WorkloadBonusProf> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);



}
