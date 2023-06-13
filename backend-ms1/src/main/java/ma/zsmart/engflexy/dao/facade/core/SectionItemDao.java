package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.SectionItem;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface SectionItemDao extends AbstractRepository<SectionItem,Long>  {

    List<SectionItem> findBySectionId(Long id);
    int deleteBySectionId(Long id);

}
