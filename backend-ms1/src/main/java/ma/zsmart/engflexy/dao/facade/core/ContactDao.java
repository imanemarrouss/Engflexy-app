package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Contact;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactDao extends AbstractRepository<Contact,Long>  {


}
