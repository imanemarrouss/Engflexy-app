package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Paiement;
import ma.zsmart.engflexy.dao.criteria.core.PaiementCriteria;
import ma.zsmart.engflexy.dao.criteria.history.PaiementHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface PaiementAdminService extends  IService<Paiement,PaiementCriteria, PaiementHistoryCriteria>  {

    List<Paiement> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<Paiement> findByGroupeEtudiantId(Long id);
    int deleteByGroupeEtudiantId(Long id);



}
