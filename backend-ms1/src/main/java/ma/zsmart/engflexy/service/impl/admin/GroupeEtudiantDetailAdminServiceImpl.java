package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.GroupeEtudiantDetail;
import ma.zsmart.engflexy.bean.history.GroupeEtudiantDetailHistory;
import ma.zsmart.engflexy.dao.criteria.core.GroupeEtudiantDetailCriteria;
import ma.zsmart.engflexy.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.GroupeEtudiantDetailDao;
import ma.zsmart.engflexy.dao.facade.history.GroupeEtudiantDetailHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.GroupeEtudiantDetailSpecification;
import ma.zsmart.engflexy.service.facade.admin.EtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.GroupeEtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.GroupeEtudiantDetailAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupeEtudiantDetailAdminServiceImpl extends AbstractServiceImpl<GroupeEtudiantDetail,GroupeEtudiantDetailHistory, GroupeEtudiantDetailCriteria, GroupeEtudiantDetailHistoryCriteria, GroupeEtudiantDetailDao,
GroupeEtudiantDetailHistoryDao> implements GroupeEtudiantDetailAdminService {



    public List<GroupeEtudiantDetail> findByGroupeEtudiantId(Long id){
        return dao.findByGroupeEtudiantId(id);
    }
    public int deleteByGroupeEtudiantId(Long id){
        return dao.deleteByGroupeEtudiantId(id);
    }
    public List<GroupeEtudiantDetail> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }



    public void configure() {
        super.configure(GroupeEtudiantDetail.class,GroupeEtudiantDetailHistory.class, GroupeEtudiantDetailHistoryCriteria.class, GroupeEtudiantDetailSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private GroupeEtudiantAdminService groupeEtudiantService ;

    public GroupeEtudiantDetailAdminServiceImpl(GroupeEtudiantDetailDao dao, GroupeEtudiantDetailHistoryDao historyDao) {
        super(dao, historyDao);
    }

}