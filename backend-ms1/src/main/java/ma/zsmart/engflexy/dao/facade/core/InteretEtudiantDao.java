package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.InteretEtudiant;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface InteretEtudiantDao extends AbstractRepository<InteretEtudiant,Long>  {
    InteretEtudiant findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW InteretEtudiant(item.id,item.libelle) FROM InteretEtudiant item")
    List<InteretEtudiant> findAllOptimized();
}
