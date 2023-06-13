package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.FreeTrialDetail;
import ma.zsmart.engflexy.bean.history.FreeTrialDetailHistory;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialDetailCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FreeTrialDetailHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.FreeTrialDetailDao;
import ma.zsmart.engflexy.dao.facade.history.FreeTrialDetailHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.FreeTrialDetailSpecification;
import ma.zsmart.engflexy.service.facade.admin.EtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialAdminService;
import ma.zsmart.engflexy.service.facade.admin.FreeTrialDetailAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FreeTrialDetailAdminServiceImpl extends AbstractServiceImpl<FreeTrialDetail,FreeTrialDetailHistory, FreeTrialDetailCriteria, FreeTrialDetailHistoryCriteria, FreeTrialDetailDao,
FreeTrialDetailHistoryDao> implements FreeTrialDetailAdminService {



    public List<FreeTrialDetail> findByFreeTrialId(Long id){
        return dao.findByFreeTrialId(id);
    }
    public int deleteByFreeTrialId(Long id){
        return dao.deleteByFreeTrialId(id);
    }
    public List<FreeTrialDetail> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }



    public void configure() {
        super.configure(FreeTrialDetail.class,FreeTrialDetailHistory.class, FreeTrialDetailHistoryCriteria.class, FreeTrialDetailSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private FreeTrialAdminService freeTrialService ;

    public FreeTrialDetailAdminServiceImpl(FreeTrialDetailDao dao, FreeTrialDetailHistoryDao historyDao) {
        super(dao, historyDao);
    }

}