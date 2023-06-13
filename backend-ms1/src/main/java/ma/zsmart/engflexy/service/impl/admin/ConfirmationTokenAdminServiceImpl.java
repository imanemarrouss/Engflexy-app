package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.ConfirmationToken;
import ma.zsmart.engflexy.bean.history.ConfirmationTokenHistory;
import ma.zsmart.engflexy.dao.criteria.core.ConfirmationTokenCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ConfirmationTokenDao;
import ma.zsmart.engflexy.dao.facade.history.ConfirmationTokenHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ConfirmationTokenSpecification;
import ma.zsmart.engflexy.service.facade.admin.ConfirmationTokenAdminService;
import ma.zsmart.engflexy.service.facade.admin.EtudiantAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ConfirmationTokenAdminServiceImpl extends AbstractServiceImpl<ConfirmationToken,ConfirmationTokenHistory, ConfirmationTokenCriteria, ConfirmationTokenHistoryCriteria, ConfirmationTokenDao,
ConfirmationTokenHistoryDao> implements ConfirmationTokenAdminService {



    public List<ConfirmationToken> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }



    public void configure() {
        super.configure(ConfirmationToken.class,ConfirmationTokenHistory.class, ConfirmationTokenHistoryCriteria.class, ConfirmationTokenSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;

    public ConfirmationTokenAdminServiceImpl(ConfirmationTokenDao dao, ConfirmationTokenHistoryDao historyDao) {
        super(dao, historyDao);
    }

}