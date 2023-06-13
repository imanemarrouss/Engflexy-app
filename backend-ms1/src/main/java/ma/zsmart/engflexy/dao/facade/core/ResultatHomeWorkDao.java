package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.ResultatHomeWork;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ResultatHomeWorkDao extends AbstractRepository<ResultatHomeWork,Long>  {
    ResultatHomeWork findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW ResultatHomeWork(item.id,item.libelle) FROM ResultatHomeWork item")
    List<ResultatHomeWork> findAllOptimized();
}
