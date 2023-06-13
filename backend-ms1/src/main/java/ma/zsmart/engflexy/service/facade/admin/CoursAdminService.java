package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Cours;
import ma.zsmart.engflexy.dao.criteria.core.CoursCriteria;
import ma.zsmart.engflexy.dao.criteria.history.CoursHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface CoursAdminService extends  IService<Cours,CoursCriteria, CoursHistoryCriteria>  {

    List<Cours> findByEtatCoursId(Long id);
    int deleteByEtatCoursId(Long id);
    List<Cours> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);



}
