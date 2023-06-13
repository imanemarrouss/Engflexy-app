package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.FaqProf;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FaqProfDao extends AbstractRepository<FaqProf,Long>  {

    List<FaqProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<FaqProf> findByAdminId(Long id);
    int deleteByAdminId(Long id);
    List<FaqProf> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);

    @Query("SELECT NEW FaqProf(item.id,item.libelle) FROM FaqProf item")
    List<FaqProf> findAllOptimized();
}
