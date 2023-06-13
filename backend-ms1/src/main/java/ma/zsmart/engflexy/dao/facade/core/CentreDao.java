package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Centre;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CentreDao extends AbstractRepository<Centre,Long>  {
    Centre findByRef(String ref);
    int deleteByRef(String ref);


    @Query("SELECT NEW Centre(item.id,item.ref) FROM Centre item")
    List<Centre> findAllOptimized();
}
