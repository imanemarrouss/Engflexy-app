package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.HomeWork;
import ma.zsmart.engflexy.dao.criteria.core.HomeWorkCriteria;
import ma.zsmart.engflexy.dao.criteria.history.HomeWorkHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface HomeWorkAdminService extends  IService<HomeWork,HomeWorkCriteria, HomeWorkHistoryCriteria>  {

    List<HomeWork> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<HomeWork> findByTypeHomeWorkId(Long id);
    int deleteByTypeHomeWorkId(Long id);



}
