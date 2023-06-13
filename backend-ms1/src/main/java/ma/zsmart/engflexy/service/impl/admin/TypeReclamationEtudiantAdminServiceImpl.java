package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.TypeReclamationEtudiant;
import ma.zsmart.engflexy.bean.history.TypeReclamationEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.core.TypeReclamationEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TypeReclamationEtudiantHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.TypeReclamationEtudiantDao;
import ma.zsmart.engflexy.dao.facade.history.TypeReclamationEtudiantHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.TypeReclamationEtudiantSpecification;
import ma.zsmart.engflexy.service.facade.admin.TypeReclamationEtudiantAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class TypeReclamationEtudiantAdminServiceImpl extends AbstractServiceImpl<TypeReclamationEtudiant,TypeReclamationEtudiantHistory, TypeReclamationEtudiantCriteria, TypeReclamationEtudiantHistoryCriteria, TypeReclamationEtudiantDao,
TypeReclamationEtudiantHistoryDao> implements TypeReclamationEtudiantAdminService {


    public TypeReclamationEtudiant findByReferenceEntity(TypeReclamationEtudiant t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TypeReclamationEtudiant.class,TypeReclamationEtudiantHistory.class, TypeReclamationEtudiantHistoryCriteria.class, TypeReclamationEtudiantSpecification.class);
    }


    public TypeReclamationEtudiantAdminServiceImpl(TypeReclamationEtudiantDao dao, TypeReclamationEtudiantHistoryDao historyDao) {
        super(dao, historyDao);
    }

}