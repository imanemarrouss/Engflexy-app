package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.HoweWorkQSTReponse;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HoweWorkQSTReponseDao extends AbstractRepository<HoweWorkQSTReponse,Long>  {
    HoweWorkQSTReponse findByRef(String ref);
    int deleteByRef(String ref);

    List<HoweWorkQSTReponse> findByEtatReponseId(Long id);
    int deleteByEtatReponseId(Long id);
    List<HoweWorkQSTReponse> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);

    @Query("SELECT NEW HoweWorkQSTReponse(item.id,item.lib) FROM HoweWorkQSTReponse item")
    List<HoweWorkQSTReponse> findAllOptimized();
}
