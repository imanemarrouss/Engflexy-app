package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.EtudiantClassRoom;
import ma.zsmart.engflexy.dao.criteria.core.EtudiantClassRoomCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface EtudiantClassRoomAdminService extends  IService<EtudiantClassRoom,EtudiantClassRoomCriteria, EtudiantClassRoomHistoryCriteria>  {

    List<EtudiantClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<EtudiantClassRoom> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
