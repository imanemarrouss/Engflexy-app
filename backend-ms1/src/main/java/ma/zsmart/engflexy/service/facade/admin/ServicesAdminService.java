package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Services;
import ma.zsmart.engflexy.dao.criteria.core.ServicesCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ServicesHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface ServicesAdminService extends  IService<Services,ServicesCriteria, ServicesHistoryCriteria>  {

    Long getNextOrdre();



}
