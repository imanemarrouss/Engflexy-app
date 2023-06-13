package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.ReponseEtudiantHomeWork;
import ma.zsmart.engflexy.dao.criteria.core.ReponseEtudiantHomeWorkCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface ReponseEtudiantHomeWorkAdminService extends  IService<ReponseEtudiantHomeWork,ReponseEtudiantHomeWorkCriteria, ReponseEtudiantHomeWorkHistoryCriteria>  {

    List<ReponseEtudiantHomeWork> findByHoweWorkQSTReponseId(Long id);
    int deleteByHoweWorkQSTReponseId(Long id);
    List<ReponseEtudiantHomeWork> findByHomeWorkEtudiantId(Long id);
    int deleteByHomeWorkEtudiantId(Long id);
    List<ReponseEtudiantHomeWork> findByHomeWorkQuestionId(Long id);
    int deleteByHomeWorkQuestionId(Long id);



}
