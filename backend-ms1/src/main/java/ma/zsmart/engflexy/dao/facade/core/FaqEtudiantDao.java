package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.FaqEtudiant;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FaqEtudiantDao extends AbstractRepository<FaqEtudiant,Long>  {

    List<FaqEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<FaqEtudiant> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqEtudiant> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);

    @Query("SELECT NEW FaqEtudiant(item.id,item.libelle) FROM FaqEtudiant item")
    List<FaqEtudiant> findAllOptimized();
}
