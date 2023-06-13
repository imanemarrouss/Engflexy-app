package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Quiz;
import ma.zsmart.engflexy.dao.criteria.core.QuizCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuizHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface QuizAdminService extends  IService<Quiz,QuizCriteria, QuizHistoryCriteria>  {

    List<Quiz> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
