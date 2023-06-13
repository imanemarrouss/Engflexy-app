package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.LevelTestConfiguration;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LevelTestConfigurationDao extends AbstractRepository<LevelTestConfiguration,Long>  {

    List<LevelTestConfiguration> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);

}
