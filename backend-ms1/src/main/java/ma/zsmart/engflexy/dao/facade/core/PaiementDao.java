package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Paiement;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PaiementDao extends AbstractRepository<Paiement,Long>  {

    List<Paiement> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<Paiement> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);

}
