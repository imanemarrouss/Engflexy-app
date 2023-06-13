package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.GroupeEtudiantDetail;
import ma.zsmart.engflexy.dao.criteria.core.GroupeEtudiantDetailCriteria;
import ma.zsmart.engflexy.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface GroupeEtudiantDetailAdminService extends  IService<GroupeEtudiantDetail,GroupeEtudiantDetailCriteria, GroupeEtudiantDetailHistoryCriteria>  {

    List<GroupeEtudiantDetail> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<GroupeEtudiantDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
