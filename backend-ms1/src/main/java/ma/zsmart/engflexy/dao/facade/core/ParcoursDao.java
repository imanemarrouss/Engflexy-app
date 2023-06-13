package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Parcours;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ParcoursDao extends AbstractRepository<Parcours,Long>  {
    Parcours findByCode(String code);
    int deleteByCode(String code);

    List<Parcours> findByCentreId(Long id);
    int deleteByCentreId(Long id);

    @Query("SELECT NEW Parcours(item.id,item.libelle) FROM Parcours item")
    List<Parcours> findAllOptimized();
}
