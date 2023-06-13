package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.TrancheHoraireProf;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TrancheHoraireProfDao extends AbstractRepository<TrancheHoraireProf,Long>  {

    List<TrancheHoraireProf> findByProfId(Long id);
    int deleteByProfId(Long id);

}
