package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.LevelTestConfiguration;
import ma.zsmart.engflexy.dao.criteria.core.LevelTestConfigurationCriteria;
import ma.zsmart.engflexy.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface LevelTestConfigurationAdminService extends  IService<LevelTestConfiguration,LevelTestConfigurationCriteria, LevelTestConfigurationHistoryCriteria>  {

    List<LevelTestConfiguration> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);



}
