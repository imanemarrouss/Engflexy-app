package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.FreeTrialConfiguration;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FreeTrialConfigurationDao extends AbstractRepository<FreeTrialConfiguration,Long>  {


}
