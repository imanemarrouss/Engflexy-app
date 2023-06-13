package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Services;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ServicesDao extends AbstractRepository<Services,Long>  {
    Services findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Services(item.id,item.libelle) FROM Services item")
    List<Services> findAllOptimized();
    @Query(value = "SELECT MAX(item.ordre) FROM Services item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
