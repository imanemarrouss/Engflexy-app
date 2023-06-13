package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.EtatCours;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EtatCoursDao extends AbstractRepository<EtatCours,Long>  {
    EtatCours findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EtatCours(item.id,item.libelle) FROM EtatCours item")
    List<EtatCours> findAllOptimized();
}
