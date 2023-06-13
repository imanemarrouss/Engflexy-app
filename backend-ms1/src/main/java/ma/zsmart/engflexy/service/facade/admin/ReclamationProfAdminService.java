package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.ReclamationProf;
import ma.zsmart.engflexy.dao.criteria.core.ReclamationProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface ReclamationProfAdminService extends  IService<ReclamationProf,ReclamationProfCriteria, ReclamationProfHistoryCriteria>  {

    List<ReclamationProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<ReclamationProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ReclamationProf> findByTypeReclamationProfId(Long id);
    int deleteByTypeReclamationProfId(Long id);



}
