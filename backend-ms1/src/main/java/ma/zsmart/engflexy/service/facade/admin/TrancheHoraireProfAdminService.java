package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.TrancheHoraireProf;
import ma.zsmart.engflexy.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface TrancheHoraireProfAdminService extends  IService<TrancheHoraireProf,TrancheHoraireProfCriteria, TrancheHoraireProfHistoryCriteria>  {

    List<TrancheHoraireProf> findByProfId(Long id);
    int deleteByProfId(Long id);



}
