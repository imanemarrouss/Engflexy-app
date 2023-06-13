package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.VocabularyQuiz;
import ma.zsmart.engflexy.dao.criteria.core.VocabularyQuizCriteria;
import ma.zsmart.engflexy.dao.criteria.history.VocabularyQuizHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface VocabularyQuizAdminService extends  IService<VocabularyQuiz,VocabularyQuizCriteria, VocabularyQuizHistoryCriteria>  {

    List<VocabularyQuiz> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
