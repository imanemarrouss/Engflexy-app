package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.TeacherLocality;
import ma.zsmart.engflexy.dao.criteria.core.TeacherLocalityCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;


public interface TeacherLocalityAdminService extends  IService<TeacherLocality,TeacherLocalityCriteria, TeacherLocalityHistoryCriteria>  {

    Long getNextOrdre();



}
