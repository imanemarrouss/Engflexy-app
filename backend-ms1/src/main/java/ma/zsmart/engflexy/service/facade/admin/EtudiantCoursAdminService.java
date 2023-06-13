package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.EtudiantCours;
import ma.zsmart.engflexy.dao.criteria.core.EtudiantCoursCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantCoursHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface EtudiantCoursAdminService extends  IService<EtudiantCours,EtudiantCoursCriteria, EtudiantCoursHistoryCriteria>  {

    List<EtudiantCours> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<EtudiantCours> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<EtudiantCours> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
