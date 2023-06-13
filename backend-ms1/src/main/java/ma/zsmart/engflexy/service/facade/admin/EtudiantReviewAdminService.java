package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.EtudiantReview;
import ma.zsmart.engflexy.dao.criteria.core.EtudiantReviewCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface EtudiantReviewAdminService extends  IService<EtudiantReview,EtudiantReviewCriteria, EtudiantReviewHistoryCriteria>  {

    List<EtudiantReview> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<EtudiantReview> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<EtudiantReview> findByCoursId(Long id);
    int deleteByCoursId(Long id);



}
