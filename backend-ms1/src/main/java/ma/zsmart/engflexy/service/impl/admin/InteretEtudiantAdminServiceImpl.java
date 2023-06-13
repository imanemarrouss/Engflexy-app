package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.InteretEtudiant;
import ma.zsmart.engflexy.bean.history.InteretEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.core.InteretEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.InteretEtudiantHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.InteretEtudiantDao;
import ma.zsmart.engflexy.dao.facade.history.InteretEtudiantHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.InteretEtudiantSpecification;
import ma.zsmart.engflexy.service.facade.admin.InteretEtudiantAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class InteretEtudiantAdminServiceImpl extends AbstractServiceImpl<InteretEtudiant,InteretEtudiantHistory, InteretEtudiantCriteria, InteretEtudiantHistoryCriteria, InteretEtudiantDao,
InteretEtudiantHistoryDao> implements InteretEtudiantAdminService {


    public InteretEtudiant findByReferenceEntity(InteretEtudiant t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(InteretEtudiant.class,InteretEtudiantHistory.class, InteretEtudiantHistoryCriteria.class, InteretEtudiantSpecification.class);
    }


    public InteretEtudiantAdminServiceImpl(InteretEtudiantDao dao, InteretEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}