package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Contact;
import ma.zsmart.engflexy.bean.history.ContactHistory;
import ma.zsmart.engflexy.dao.criteria.core.ContactCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ContactHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ContactDao;
import ma.zsmart.engflexy.dao.facade.history.ContactHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ContactSpecification;
import ma.zsmart.engflexy.service.facade.admin.ContactAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class ContactAdminServiceImpl extends AbstractServiceImpl<Contact,ContactHistory, ContactCriteria, ContactHistoryCriteria, ContactDao,
ContactHistoryDao> implements ContactAdminService {






    public void configure() {
        super.configure(Contact.class,ContactHistory.class, ContactHistoryCriteria.class, ContactSpecification.class);
    }


    public ContactAdminServiceImpl(ContactDao dao, ContactHistoryDao historyDao) {
        super(dao, historyDao);
    }

}