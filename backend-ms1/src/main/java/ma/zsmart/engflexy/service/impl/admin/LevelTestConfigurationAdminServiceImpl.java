package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.LevelTestConfiguration;
import ma.zsmart.engflexy.bean.history.LevelTestConfigurationHistory;
import ma.zsmart.engflexy.dao.criteria.core.LevelTestConfigurationCriteria;
import ma.zsmart.engflexy.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.LevelTestConfigurationDao;
import ma.zsmart.engflexy.dao.facade.history.LevelTestConfigurationHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.LevelTestConfigurationSpecification;
import ma.zsmart.engflexy.service.facade.admin.LevelTestConfigurationAdminService;
import ma.zsmart.engflexy.service.facade.admin.ParcoursAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LevelTestConfigurationAdminServiceImpl extends AbstractServiceImpl<LevelTestConfiguration,LevelTestConfigurationHistory, LevelTestConfigurationCriteria, LevelTestConfigurationHistoryCriteria, LevelTestConfigurationDao,
LevelTestConfigurationHistoryDao> implements LevelTestConfigurationAdminService {



    public List<LevelTestConfiguration> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }



    public void configure() {
        super.configure(LevelTestConfiguration.class,LevelTestConfigurationHistory.class, LevelTestConfigurationHistoryCriteria.class, LevelTestConfigurationSpecification.class);
    }

    @Autowired
    private ParcoursAdminService parcoursService ;

    public LevelTestConfigurationAdminServiceImpl(LevelTestConfigurationDao dao, LevelTestConfigurationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}