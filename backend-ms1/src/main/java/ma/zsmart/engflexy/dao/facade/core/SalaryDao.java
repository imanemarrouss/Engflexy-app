package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Salary;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SalaryDao extends AbstractRepository<Salary,Long>  {
    Salary findByCode(String code);
    int deleteByCode(String code);

    List<Salary> findByProfId(Long id);
    int deleteByProfId(Long id);

    @Query("SELECT NEW Salary(item.id,item.code) FROM Salary item")
    List<Salary> findAllOptimized();
}
