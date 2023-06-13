package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.HomeWorkEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.HomeWorkEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.HomeWorkEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface HomeWorkEtudiantAdminService extends  IService<HomeWorkEtudiant,HomeWorkEtudiantCriteria, HomeWorkEtudiantHistoryCriteria>  {

    List<HomeWorkEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<HomeWorkEtudiant> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);
    List<HomeWorkEtudiant> findByResultatHomeWorkId(Long id);
    int deleteByResultatHomeWorkId(Long id);



}
