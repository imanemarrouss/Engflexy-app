package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.CalendrierProf;
import ma.zsmart.engflexy.bean.history.CalendrierProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.CalendrierProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.CalendrierProfDao;
import ma.zsmart.engflexy.dao.facade.history.CalendrierProfHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.CalendrierProfSpecification;
import ma.zsmart.engflexy.service.facade.admin.CalendrierProfAdminService;
import ma.zsmart.engflexy.service.facade.admin.EtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CalendrierProfAdminServiceImpl extends AbstractServiceImpl<CalendrierProf,CalendrierProfHistory, CalendrierProfCriteria, CalendrierProfHistoryCriteria, CalendrierProfDao,
CalendrierProfHistoryDao> implements CalendrierProfAdminService {


    public CalendrierProf findByReferenceEntity(CalendrierProf t){
        return  dao.findByRef(t.getRef());
    }

    public List<CalendrierProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<CalendrierProf> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }



    public void configure() {
        super.configure(CalendrierProf.class,CalendrierProfHistory.class, CalendrierProfHistoryCriteria.class, CalendrierProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private EtudiantAdminService etudiantService ;

    public CalendrierProfAdminServiceImpl(CalendrierProfDao dao, CalendrierProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}