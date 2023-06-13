package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.ProfReview;
import ma.zsmart.engflexy.bean.history.ProfReviewHistory;
import ma.zsmart.engflexy.dao.criteria.core.ProfReviewCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ProfReviewDao;
import ma.zsmart.engflexy.dao.facade.history.ProfReviewHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ProfReviewSpecification;
import ma.zsmart.engflexy.service.facade.admin.CoursAdminService;
import ma.zsmart.engflexy.service.facade.admin.EtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.service.facade.admin.ProfReviewAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfReviewAdminServiceImpl extends AbstractServiceImpl<ProfReview,ProfReviewHistory, ProfReviewCriteria, ProfReviewHistoryCriteria, ProfReviewDao,
ProfReviewHistoryDao> implements ProfReviewAdminService {



    public List<ProfReview> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<ProfReview> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ProfReview> findByCoursId(Long id){
        return dao.findByCoursId(id);
    }
    public int deleteByCoursId(Long id){
        return dao.deleteByCoursId(id);
    }



    public void configure() {
        super.configure(ProfReview.class,ProfReviewHistory.class, ProfReviewHistoryCriteria.class, ProfReviewSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private CoursAdminService coursService ;

    public ProfReviewAdminServiceImpl(ProfReviewDao dao, ProfReviewHistoryDao historyDao) {
        super(dao, historyDao);
    }

}