package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.ReclamationEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface ReclamationEtudiantAdminService extends  IService<ReclamationEtudiant,ReclamationEtudiantCriteria, ReclamationEtudiantHistoryCriteria>  {

    List<ReclamationEtudiant> findByTypeReclamationEtudiantId(Long id);
    int deleteByTypeReclamationEtudiantId(Long id);



}
