package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.SessionCours;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SessionCoursDao extends AbstractRepository<SessionCours,Long>  {
    SessionCours findByReference(String reference);
    int deleteByReference(String reference);

    List<SessionCours> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<SessionCours> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<SessionCours> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<SessionCours> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);

    @Query("SELECT NEW SessionCours(item.id,item.reference) FROM SessionCours item")
    List<SessionCours> findAllOptimized();
}
