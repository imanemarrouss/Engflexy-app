package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Reponse;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ReponseDao extends AbstractRepository<Reponse,Long>  {
    Reponse findByRef(String ref);
    int deleteByRef(String ref);

    List<Reponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<Reponse> findByQuestionId(Long id);
    int deleteByQuestionId(Long id);

    @Query("SELECT NEW Reponse(item.id,item.lib) FROM Reponse item")
    List<Reponse> findAllOptimized();
}
