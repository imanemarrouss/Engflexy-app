package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.ClassRoom;
import ma.zsmart.engflexy.dao.criteria.core.ClassRoomCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface ClassRoomAdminService extends  IService<ClassRoom,ClassRoomCriteria, ClassRoomHistoryCriteria>  {

    List<ClassRoom> findByProfId(Long id);
    int deleteByProfId(Long id);



}
