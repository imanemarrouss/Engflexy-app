package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.QuizEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.QuizEtudiantCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuizEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface QuizEtudiantAdminService extends  IService<QuizEtudiant,QuizEtudiantCriteria, QuizEtudiantHistoryCriteria>  {

    List<QuizEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<QuizEtudiant> findByQuizId(Long id);
    int deleteByQuizId(Long id);



}
