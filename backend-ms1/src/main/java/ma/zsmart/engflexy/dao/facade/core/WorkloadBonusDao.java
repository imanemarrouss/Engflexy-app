package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.WorkloadBonus;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface WorkloadBonusDao extends AbstractRepository<WorkloadBonus,Long>  {
    WorkloadBonus findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW WorkloadBonus(item.id,item.code) FROM WorkloadBonus item")
    List<WorkloadBonus> findAllOptimized();
}
