package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.ClassAverageBonusProf;
import ma.zsmart.engflexy.bean.history.ClassAverageBonusProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.ClassAverageBonusProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ClassAverageBonusProfDao;
import ma.zsmart.engflexy.dao.facade.history.ClassAverageBonusProfHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ClassAverageBonusProfSpecification;
import ma.zsmart.engflexy.service.facade.admin.ClassAverageBonusProfAdminService;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.service.facade.admin.SalaryAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassAverageBonusProfAdminServiceImpl extends AbstractServiceImpl<ClassAverageBonusProf,ClassAverageBonusProfHistory, ClassAverageBonusProfCriteria, ClassAverageBonusProfHistoryCriteria, ClassAverageBonusProfDao,
ClassAverageBonusProfHistoryDao> implements ClassAverageBonusProfAdminService {



    public List<ClassAverageBonusProf> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }
    public List<ClassAverageBonusProf> findBySalaryId(Long id){
        return dao.findBySalaryId(id);
    }
    public int deleteBySalaryId(Long id){
        return dao.deleteBySalaryId(id);
    }



    public void configure() {
        super.configure(ClassAverageBonusProf.class,ClassAverageBonusProfHistory.class, ClassAverageBonusProfHistoryCriteria.class, ClassAverageBonusProfSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private SalaryAdminService salaryService ;

    public ClassAverageBonusProfAdminServiceImpl(ClassAverageBonusProfDao dao, ClassAverageBonusProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}