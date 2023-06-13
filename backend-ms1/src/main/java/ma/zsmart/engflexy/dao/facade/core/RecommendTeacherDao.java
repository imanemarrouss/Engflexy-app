package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.RecommendTeacher;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RecommendTeacherDao extends AbstractRepository<RecommendTeacher,Long>  {
    RecommendTeacher findByRef(String ref);
    int deleteByRef(String ref);

    List<RecommendTeacher> findByProfId(Long id);
    int deleteByProfId(Long id);

    @Query("SELECT NEW RecommendTeacher(item.id,item.ref) FROM RecommendTeacher item")
    List<RecommendTeacher> findAllOptimized();
}
