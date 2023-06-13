package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.QuizEtudiant;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuizEtudiantDao extends AbstractRepository<QuizEtudiant,Long>  {
    QuizEtudiant findByRef(String ref);
    int deleteByRef(String ref);

    List<QuizEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<QuizEtudiant> findByQuizId(Long id);
    int deleteByQuizId(Long id);

    @Query("SELECT NEW QuizEtudiant(item.id,item.ref) FROM QuizEtudiant item")
    List<QuizEtudiant> findAllOptimized();
}
