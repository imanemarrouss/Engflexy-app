package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Salary;
import ma.zsmart.engflexy.bean.history.SalaryHistory;
import ma.zsmart.engflexy.dao.criteria.core.SalaryCriteria;
import ma.zsmart.engflexy.dao.criteria.history.SalaryHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.SalaryDao;
import ma.zsmart.engflexy.dao.facade.history.SalaryHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.SalarySpecification;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.service.facade.admin.SalaryAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalaryAdminServiceImpl extends AbstractServiceImpl<Salary,SalaryHistory, SalaryCriteria, SalaryHistoryCriteria, SalaryDao,
SalaryHistoryDao> implements SalaryAdminService {


    public Salary findByReferenceEntity(Salary t){
        return  dao.findByCode(t.getCode());
    }

    public List<Salary> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }



    public void configure() {
        super.configure(Salary.class,SalaryHistory.class, SalaryHistoryCriteria.class, SalarySpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;

    public SalaryAdminServiceImpl(SalaryDao dao, SalaryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}