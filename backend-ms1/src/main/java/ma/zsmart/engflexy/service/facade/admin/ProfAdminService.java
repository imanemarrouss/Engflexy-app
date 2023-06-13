package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Prof;
import ma.zsmart.engflexy.dao.criteria.core.ProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface ProfAdminService extends  IService<Prof,ProfCriteria, ProfHistoryCriteria>  {

    List<Prof> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<Prof> findByCategorieProfId(Long id);
    int deleteByCategorieProfId(Long id);
    List<Prof> findByTypeTeacherId(Long id);
    int deleteByTypeTeacherId(Long id);



}
