package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.ReponseEtudiant;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReponseEtudiantDao extends AbstractRepository<ReponseEtudiant,Long>  {
    ReponseEtudiant findByRef(String ref);
    int deleteByRef(String ref);

    List<ReponseEtudiant> findByReponseId(Long id);
    int deleteByReponseId(Long id);
    List<ReponseEtudiant> findByQuizEtudiantId(Long id);
    int deleteByQuizEtudiantId(Long id);
    List<ReponseEtudiant> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);

    @Query("SELECT NEW ReponseEtudiant(item.id,item.ref) FROM ReponseEtudiant item")
    List<ReponseEtudiant> findAllOptimized();
}
