package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Vocabulary;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VocabularyDao extends AbstractRepository<Vocabulary,Long>  {

    List<Vocabulary> findBySectionId(Long id);
    int deleteBySectionId(Long id);
    List<Vocabulary> findByVocabularyQuizId(Long id);
    int deleteByVocabularyQuizId(Long id);

}
