package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.ProfReview;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProfReviewDao extends AbstractRepository<ProfReview,Long>  {

    List<ProfReview> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<ProfReview> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ProfReview> findByCoursId(Long id);
    int deleteByCoursId(Long id);

}
