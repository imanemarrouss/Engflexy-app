package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.GroupeEtudiantDetail;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GroupeEtudiantDetailDao extends AbstractRepository<GroupeEtudiantDetail,Long>  {

    List<GroupeEtudiantDetail> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);
    List<GroupeEtudiantDetail> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
