package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.StatutFreeTrial;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StatutFreeTrialDao extends AbstractRepository<StatutFreeTrial,Long>  {
    StatutFreeTrial findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW StatutFreeTrial(item.id,item.libelle) FROM StatutFreeTrial item")
    List<StatutFreeTrial> findAllOptimized();
}
