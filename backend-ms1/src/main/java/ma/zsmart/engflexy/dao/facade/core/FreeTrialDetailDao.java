package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.FreeTrialDetail;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface FreeTrialDetailDao extends AbstractRepository<FreeTrialDetail,Long>  {

    List<FreeTrialDetail> findByFreeTrialId(Long id);
    int deleteByFreeTrialId(Long id);
    List<FreeTrialDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
