package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Cours;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CoursDao extends AbstractRepository<Cours,Long>  {
    Cours findByCode(String code);
    int deleteByCode(String code);

    List<Cours> findByEtatCoursId(Long id);
    int deleteByEtatCoursId(Long id);
    List<Cours> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);

    @Query("SELECT NEW Cours(item.id,item.libelle) FROM Cours item")
    List<Cours> findAllOptimized();
}
