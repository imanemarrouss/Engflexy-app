package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.HomeWorkQuestion;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HomeWorkQuestionDao extends AbstractRepository<HomeWorkQuestion,Long>  {
    HomeWorkQuestion findByRef(String ref);
    int deleteByRef(String ref);

    List<HomeWorkQuestion> findByTypeDeQuestionId(Long id);
    int deleteByTypeDeQuestionId(Long id);
    List<HomeWorkQuestion> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);

    @Query("SELECT NEW HomeWorkQuestion(item.id,item.libelle) FROM HomeWorkQuestion item")
    List<HomeWorkQuestion> findAllOptimized();
}
