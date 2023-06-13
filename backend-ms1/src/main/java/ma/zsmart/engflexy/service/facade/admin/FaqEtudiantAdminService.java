package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.FaqEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.FaqEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface FaqEtudiantAdminService extends  IService<FaqEtudiant,FaqEtudiantCriteria, FaqEtudiantHistoryCriteria>  {

    List<FaqEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<FaqEtudiant> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqEtudiant> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
