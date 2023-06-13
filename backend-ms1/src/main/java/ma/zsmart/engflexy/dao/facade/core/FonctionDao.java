package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Fonction;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FonctionDao extends AbstractRepository<Fonction,Long>  {
    Fonction findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Fonction(item.id,item.libelle) FROM Fonction item")
    List<Fonction> findAllOptimized();
}
