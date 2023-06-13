package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.ClassAverageBonusProf;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClassAverageBonusProfDao extends AbstractRepository<ClassAverageBonusProf,Long>  {

    List<ClassAverageBonusProf> findByProfId(Long id);
    int deleteByProfId(Long id);
    List<ClassAverageBonusProf> findBySalaryId(Long id);
    int deleteBySalaryId(Long id);

}
