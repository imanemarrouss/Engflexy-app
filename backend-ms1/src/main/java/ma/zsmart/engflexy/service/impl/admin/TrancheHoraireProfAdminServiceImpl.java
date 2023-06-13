package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.TrancheHoraireProf;
import ma.zsmart.engflexy.bean.history.TrancheHoraireProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.TrancheHoraireProfDao;
import ma.zsmart.engflexy.dao.facade.history.TrancheHoraireProfHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.TrancheHoraireProfSpecification;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.service.facade.admin.TrancheHoraireProfAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TrancheHoraireProfAdminServiceImpl extends AbstractServiceImpl<TrancheHoraireProf,TrancheHoraireProfHistory, TrancheHoraireProfCriteria, TrancheHoraireProfHistoryCriteria, TrancheHoraireProfDao,
TrancheHoraireProfHistoryDao> implements TrancheHoraireProfAdminService {



    public List<TrancheHoraireProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }



    public void configure() {
        super.configure(TrancheHoraireProf.class,TrancheHoraireProfHistory.class, TrancheHoraireProfHistoryCriteria.class, TrancheHoraireProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;

    public TrancheHoraireProfAdminServiceImpl(TrancheHoraireProfDao dao, TrancheHoraireProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}