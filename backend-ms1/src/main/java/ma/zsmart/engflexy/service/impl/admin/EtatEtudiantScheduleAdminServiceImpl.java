package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.EtatEtudiantSchedule;
import ma.zsmart.engflexy.bean.history.EtatEtudiantScheduleHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtatEtudiantScheduleCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtatEtudiantScheduleHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.EtatEtudiantScheduleDao;
import ma.zsmart.engflexy.dao.facade.history.EtatEtudiantScheduleHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.EtatEtudiantScheduleSpecification;
import ma.zsmart.engflexy.service.facade.admin.EtatEtudiantScheduleAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class EtatEtudiantScheduleAdminServiceImpl extends AbstractServiceImpl<EtatEtudiantSchedule,EtatEtudiantScheduleHistory, EtatEtudiantScheduleCriteria, EtatEtudiantScheduleHistoryCriteria, EtatEtudiantScheduleDao,
EtatEtudiantScheduleHistoryDao> implements EtatEtudiantScheduleAdminService {


    public EtatEtudiantSchedule findByReferenceEntity(EtatEtudiantSchedule t){
        return  dao.findByLibelle(t.getLibelle());
    }




    public void configure() {
        super.configure(EtatEtudiantSchedule.class,EtatEtudiantScheduleHistory.class, EtatEtudiantScheduleHistoryCriteria.class, EtatEtudiantScheduleSpecification.class);
    }


    public EtatEtudiantScheduleAdminServiceImpl(EtatEtudiantScheduleDao dao, EtatEtudiantScheduleHistoryDao historyDao) {
        super(dao, historyDao);
    }

}