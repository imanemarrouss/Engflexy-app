package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Paiement;
import ma.zsmart.engflexy.bean.history.PaiementHistory;
import ma.zsmart.engflexy.dao.criteria.core.PaiementCriteria;
import ma.zsmart.engflexy.dao.criteria.history.PaiementHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.PaiementDao;
import ma.zsmart.engflexy.dao.facade.history.PaiementHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.PaiementSpecification;
import ma.zsmart.engflexy.service.facade.admin.GroupeEtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.PaiementAdminService;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PaiementAdminServiceImpl extends AbstractServiceImpl<Paiement,PaiementHistory, PaiementCriteria, PaiementHistoryCriteria, PaiementDao,
PaiementHistoryDao> implements PaiementAdminService {



    public List<Paiement> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<Paiement> findByGroupeEtudiantId(Long id){
        return dao.findByGroupeEtudiantId(id);
    }
    public int deleteByGroupeEtudiantId(Long id){
        return dao.deleteByGroupeEtudiantId(id);
    }



    public void configure() {
        super.configure(Paiement.class,PaiementHistory.class, PaiementHistoryCriteria.class, PaiementSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private GroupeEtudiantAdminService groupeEtudiantService ;

    public PaiementAdminServiceImpl(PaiementDao dao, PaiementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}