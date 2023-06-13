package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.EtatEtudiant;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EtatEtudiantDao extends AbstractRepository<EtatEtudiant,Long>  {
    EtatEtudiant findByReference(String reference);
    int deleteByReference(String reference);


    @Query("SELECT NEW EtatEtudiant(item.id,item.reference) FROM EtatEtudiant item")
    List<EtatEtudiant> findAllOptimized();
}
