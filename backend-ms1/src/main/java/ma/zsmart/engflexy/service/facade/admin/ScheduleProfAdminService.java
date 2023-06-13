package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.ScheduleProf;
import ma.zsmart.engflexy.dao.criteria.core.ScheduleProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ScheduleProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface ScheduleProfAdminService extends  IService<ScheduleProf,ScheduleProfCriteria, ScheduleProfHistoryCriteria>  {

    List<ScheduleProf> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<ScheduleProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ScheduleProf> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
