package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.CategorieProf;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategorieProfDao extends AbstractRepository<CategorieProf,Long>  {
    CategorieProf findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW CategorieProf(item.id,item.code) FROM CategorieProf item")
    List<CategorieProf> findAllOptimized();
}
