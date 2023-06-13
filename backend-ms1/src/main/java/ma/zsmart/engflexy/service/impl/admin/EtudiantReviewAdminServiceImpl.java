package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.EtudiantReview;
import ma.zsmart.engflexy.bean.history.EtudiantReviewHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtudiantReviewCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.EtudiantReviewDao;
import ma.zsmart.engflexy.dao.facade.history.EtudiantReviewHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.EtudiantReviewSpecification;
import ma.zsmart.engflexy.service.facade.admin.CoursAdminService;
import ma.zsmart.engflexy.service.facade.admin.EtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.EtudiantReviewAdminService;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EtudiantReviewAdminServiceImpl extends AbstractServiceImpl<EtudiantReview,EtudiantReviewHistory, EtudiantReviewCriteria, EtudiantReviewHistoryCriteria, EtudiantReviewDao,
EtudiantReviewHistoryDao> implements EtudiantReviewAdminService {



    public List<EtudiantReview> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<EtudiantReview> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<EtudiantReview> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }



    public void configure() {
        super.configure(EtudiantReview.class,EtudiantReviewHistory.class, EtudiantReviewHistoryCriteria.class, EtudiantReviewSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private CoursAdminService coursService ;

    public EtudiantReviewAdminServiceImpl(EtudiantReviewDao dao, EtudiantReviewHistoryDao historyDao) {
        super(dao, historyDao);
    }

}