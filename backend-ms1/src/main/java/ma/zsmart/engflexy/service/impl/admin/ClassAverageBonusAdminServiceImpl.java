package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.ClassAverageBonus;
import ma.zsmart.engflexy.bean.history.ClassAverageBonusHistory;
import ma.zsmart.engflexy.dao.criteria.core.ClassAverageBonusCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ClassAverageBonusHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ClassAverageBonusDao;
import ma.zsmart.engflexy.dao.facade.history.ClassAverageBonusHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ClassAverageBonusSpecification;
import ma.zsmart.engflexy.service.facade.admin.ClassAverageBonusAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class ClassAverageBonusAdminServiceImpl extends AbstractServiceImpl<ClassAverageBonus,ClassAverageBonusHistory, ClassAverageBonusCriteria, ClassAverageBonusHistoryCriteria, ClassAverageBonusDao,
ClassAverageBonusHistoryDao> implements ClassAverageBonusAdminService {


    public ClassAverageBonus findByReferenceEntity(ClassAverageBonus t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(ClassAverageBonus.class,ClassAverageBonusHistory.class, ClassAverageBonusHistoryCriteria.class, ClassAverageBonusSpecification.class);
    }


    public ClassAverageBonusAdminServiceImpl(ClassAverageBonusDao dao, ClassAverageBonusHistoryDao historyDao) {
        super(dao, historyDao);
    }

}