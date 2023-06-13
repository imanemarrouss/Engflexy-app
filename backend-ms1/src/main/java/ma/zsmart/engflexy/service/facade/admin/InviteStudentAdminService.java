package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.InviteStudent;
import ma.zsmart.engflexy.dao.criteria.core.InviteStudentCriteria;
import ma.zsmart.engflexy.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface InviteStudentAdminService extends  IService<InviteStudent,InviteStudentCriteria, InviteStudentHistoryCriteria>  {

    List<InviteStudent> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
