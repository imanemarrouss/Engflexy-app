package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.TypeReclamationEtudiant;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TypeReclamationEtudiantDao extends AbstractRepository<TypeReclamationEtudiant,Long>  {
    TypeReclamationEtudiant findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeReclamationEtudiant(item.id,item.libelle) FROM TypeReclamationEtudiant item")
    List<TypeReclamationEtudiant> findAllOptimized();
}
