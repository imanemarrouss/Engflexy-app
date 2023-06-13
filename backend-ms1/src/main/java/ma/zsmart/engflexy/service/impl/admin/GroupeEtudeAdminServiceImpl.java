package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.GroupeEtude;
import ma.zsmart.engflexy.bean.history.GroupeEtudeHistory;
import ma.zsmart.engflexy.dao.criteria.core.GroupeEtudeCriteria;
import ma.zsmart.engflexy.dao.criteria.history.GroupeEtudeHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.GroupeEtudeDao;
import ma.zsmart.engflexy.dao.facade.history.GroupeEtudeHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.GroupeEtudeSpecification;
import ma.zsmart.engflexy.service.facade.admin.GroupeEtudeAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class GroupeEtudeAdminServiceImpl extends AbstractServiceImpl<GroupeEtude,GroupeEtudeHistory, GroupeEtudeCriteria, GroupeEtudeHistoryCriteria, GroupeEtudeDao,
GroupeEtudeHistoryDao> implements GroupeEtudeAdminService {






    public void configure() {
        super.configure(GroupeEtude.class,GroupeEtudeHistory.class, GroupeEtudeHistoryCriteria.class, GroupeEtudeSpecification.class);
    }


    public GroupeEtudeAdminServiceImpl(GroupeEtudeDao dao, GroupeEtudeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}