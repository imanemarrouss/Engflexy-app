package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.RecommendTeacher;
import ma.zsmart.engflexy.dao.criteria.core.RecommendTeacherCriteria;
import ma.zsmart.engflexy.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface RecommendTeacherAdminService extends  IService<RecommendTeacher,RecommendTeacherCriteria, RecommendTeacherHistoryCriteria>  {

    List<RecommendTeacher> findByProfId(Long id);
    int deleteByProfId(Long id);



}
