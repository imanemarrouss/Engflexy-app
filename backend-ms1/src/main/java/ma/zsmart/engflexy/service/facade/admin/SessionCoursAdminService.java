package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.SessionCours;
import ma.zsmart.engflexy.dao.criteria.core.SessionCoursCriteria;
import ma.zsmart.engflexy.dao.criteria.history.SessionCoursHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface SessionCoursAdminService extends  IService<SessionCours,SessionCoursCriteria, SessionCoursHistoryCriteria>  {

    List<SessionCours> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<SessionCours> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<SessionCours> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<SessionCours> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);



}
