package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Prof;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProfDao extends AbstractRepository<Prof,Long>  {
    Prof findByRef(String ref);
    int deleteByRef(String ref);

    List<Prof> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<Prof> findByCategorieProfId(Long id);
    int deleteByCategorieProfId(Long id);
    List<Prof> findByTypeTeacherId(Long id);
    int deleteByTypeTeacherId(Long id);

    @Query("SELECT NEW Prof(item.id,item.ref) FROM Prof item")
    List<Prof> findAllOptimized();
}
