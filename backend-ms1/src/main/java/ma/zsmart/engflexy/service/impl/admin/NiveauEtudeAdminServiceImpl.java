package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.NiveauEtude;
import ma.zsmart.engflexy.bean.history.NiveauEtudeHistory;
import ma.zsmart.engflexy.dao.criteria.core.NiveauEtudeCriteria;
import ma.zsmart.engflexy.dao.criteria.history.NiveauEtudeHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.NiveauEtudeDao;
import ma.zsmart.engflexy.dao.facade.history.NiveauEtudeHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.NiveauEtudeSpecification;
import ma.zsmart.engflexy.service.facade.admin.NiveauEtudeAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class NiveauEtudeAdminServiceImpl extends AbstractServiceImpl<NiveauEtude,NiveauEtudeHistory, NiveauEtudeCriteria, NiveauEtudeHistoryCriteria, NiveauEtudeDao,
NiveauEtudeHistoryDao> implements NiveauEtudeAdminService {


    public NiveauEtude findByReferenceEntity(NiveauEtude t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(NiveauEtude.class,NiveauEtudeHistory.class, NiveauEtudeHistoryCriteria.class, NiveauEtudeSpecification.class);
    }


    public NiveauEtudeAdminServiceImpl(NiveauEtudeDao dao, NiveauEtudeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}