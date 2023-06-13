package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.FaqType;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FaqTypeDao extends AbstractRepository<FaqType,Long>  {


    @Query("SELECT NEW FaqType(item.id,item.libelle) FROM FaqType item")
    List<FaqType> findAllOptimized();
}
