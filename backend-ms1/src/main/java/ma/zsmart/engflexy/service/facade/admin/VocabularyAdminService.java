package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Vocabulary;
import ma.zsmart.engflexy.dao.criteria.core.VocabularyCriteria;
import ma.zsmart.engflexy.dao.criteria.history.VocabularyHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface VocabularyAdminService extends  IService<Vocabulary,VocabularyCriteria, VocabularyHistoryCriteria>  {

    List<Vocabulary> findBySectionId(Long id);
    int deleteBySectionId(Long id);
    List<Vocabulary> findByVocabularyQuizId(Long id);
    int deleteByVocabularyQuizId(Long id);



}
