package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.TypeReclamationProf;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TypeReclamationProfDao extends AbstractRepository<TypeReclamationProf,Long>  {
    TypeReclamationProf findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeReclamationProf(item.id,item.libelle) FROM TypeReclamationProf item")
    List<TypeReclamationProf> findAllOptimized();
}
