package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.CalendrierProf;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CalendrierProfDao extends AbstractRepository<CalendrierProf,Long>  {
    CalendrierProf findByRef(String ref);
    int deleteByRef(String ref);

    List<CalendrierProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<CalendrierProf> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

    @Query("SELECT NEW CalendrierProf(item.id,item.ref) FROM CalendrierProf item")
    List<CalendrierProf> findAllOptimized();
}
