package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.ConfirmationToken;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ConfirmationTokenDao extends AbstractRepository<ConfirmationToken,Long>  {

    List<ConfirmationToken> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
