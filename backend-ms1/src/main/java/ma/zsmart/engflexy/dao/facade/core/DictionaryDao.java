package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Dictionary;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DictionaryDao extends AbstractRepository<Dictionary,Long>  {

    List<Dictionary> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

    @Query("SELECT NEW Dictionary(item.id,item.word) FROM Dictionary item")
    List<Dictionary> findAllOptimized();
}
