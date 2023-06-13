package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Contact;
import ma.zsmart.engflexy.dao.criteria.core.ContactCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ContactHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface ContactAdminService extends  IService<Contact,ContactCriteria, ContactHistoryCriteria>  {




}
