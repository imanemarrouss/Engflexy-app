package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Section;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SectionDao extends AbstractRepository<Section,Long>  {
    Section findByCode(String code);
    int deleteByCode(String code);

    List<Section> findByCategorieSectionId(Long id);
    int deleteByCategorieSectionId(Long id);
    List<Section> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<Section> findBySessionCoursId(Long id);
    int deleteBySessionCoursId(Long id);

    @Query("SELECT NEW Section(item.id,item.code) FROM Section item")
    List<Section> findAllOptimized();
}
