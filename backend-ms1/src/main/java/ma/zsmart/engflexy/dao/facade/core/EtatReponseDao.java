package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.EtatReponse;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EtatReponseDao extends AbstractRepository<EtatReponse,Long>  {
    EtatReponse findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatReponse(item.id,item.libelle) FROM EtatReponse item")
    List<EtatReponse> findAllOptimized();
}
