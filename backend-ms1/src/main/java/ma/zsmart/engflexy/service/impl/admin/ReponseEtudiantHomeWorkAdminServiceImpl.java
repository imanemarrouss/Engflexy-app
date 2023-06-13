package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.ReponseEtudiantHomeWork;
import ma.zsmart.engflexy.bean.history.ReponseEtudiantHomeWorkHistory;
import ma.zsmart.engflexy.dao.criteria.core.ReponseEtudiantHomeWorkCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ReponseEtudiantHomeWorkDao;
import ma.zsmart.engflexy.dao.facade.history.ReponseEtudiantHomeWorkHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ReponseEtudiantHomeWorkSpecification;
import ma.zsmart.engflexy.service.facade.admin.HomeWorkEtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.HomeWorkQuestionAdminService;
import ma.zsmart.engflexy.service.facade.admin.HoweWorkQSTReponseAdminService;
import ma.zsmart.engflexy.service.facade.admin.ReponseEtudiantHomeWorkAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReponseEtudiantHomeWorkAdminServiceImpl extends AbstractServiceImpl<ReponseEtudiantHomeWork,ReponseEtudiantHomeWorkHistory, ReponseEtudiantHomeWorkCriteria, ReponseEtudiantHomeWorkHistoryCriteria, ReponseEtudiantHomeWorkDao,
ReponseEtudiantHomeWorkHistoryDao> implements ReponseEtudiantHomeWorkAdminService {



    public List<ReponseEtudiantHomeWork> findByHoweWorkQSTReponseId(Long id){
        return dao.findByHoweWorkQSTReponseId(id);
    }
    public int deleteByHoweWorkQSTReponseId(Long id){
        return dao.deleteByHoweWorkQSTReponseId(id);
    }
    public List<ReponseEtudiantHomeWork> findByHomeWorkEtudiantId(Long id){
        return dao.findByHomeWorkEtudiantId(id);
    }
    public int deleteByHomeWorkEtudiantId(Long id){
        return dao.deleteByHomeWorkEtudiantId(id);
    }
    public List<ReponseEtudiantHomeWork> findByHomeWorkQuestionId(Long id){
        return dao.findByHomeWorkQuestionId(id);
    }
    public int deleteByHomeWorkQuestionId(Long id){
        return dao.deleteByHomeWorkQuestionId(id);
    }



    public void configure() {
        super.configure(ReponseEtudiantHomeWork.class,ReponseEtudiantHomeWorkHistory.class, ReponseEtudiantHomeWorkHistoryCriteria.class, ReponseEtudiantHomeWorkSpecification.class);
    }

    @Autowired
    private HomeWorkQuestionAdminService homeWorkQuestionService ;
    @Autowired
    private HoweWorkQSTReponseAdminService howeWorkQSTReponseService ;
    @Autowired
    private HomeWorkEtudiantAdminService homeWorkEtudiantService ;

    public ReponseEtudiantHomeWorkAdminServiceImpl(ReponseEtudiantHomeWorkDao dao, ReponseEtudiantHomeWorkHistoryDao historyDao) {
        super(dao, historyDao);
    }

}