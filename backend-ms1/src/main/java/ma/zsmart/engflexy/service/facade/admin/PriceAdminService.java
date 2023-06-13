package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Price;
import ma.zsmart.engflexy.dao.criteria.core.PriceCriteria;
import ma.zsmart.engflexy.dao.criteria.history.PriceHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface PriceAdminService extends  IService<Price,PriceCriteria, PriceHistoryCriteria>  {




}
