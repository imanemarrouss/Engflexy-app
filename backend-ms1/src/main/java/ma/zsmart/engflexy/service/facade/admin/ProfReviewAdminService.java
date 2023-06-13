package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.ProfReview;
import ma.zsmart.engflexy.dao.criteria.core.ProfReviewCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface ProfReviewAdminService extends  IService<ProfReview,ProfReviewCriteria, ProfReviewHistoryCriteria>  {

    List<ProfReview> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<ProfReview> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ProfReview> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
