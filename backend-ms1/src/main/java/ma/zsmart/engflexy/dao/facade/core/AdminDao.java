package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Admin;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminDao extends AbstractRepository<Admin,Long>  {


}
