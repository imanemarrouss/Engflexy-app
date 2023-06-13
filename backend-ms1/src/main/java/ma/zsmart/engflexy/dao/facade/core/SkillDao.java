package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Skill;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SkillDao extends AbstractRepository<Skill,Long>  {
    Skill findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Skill(item.id,item.libelle) FROM Skill item")
    List<Skill> findAllOptimized();
}
