package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.QuizClassRoom;
import ma.zsmart.engflexy.dao.criteria.core.QuizClassRoomCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface QuizClassRoomAdminService extends  IService<QuizClassRoom,QuizClassRoomCriteria, QuizClassRoomHistoryCriteria>  {

    List<QuizClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<QuizClassRoom> findByQuizId(Long id);
    int deleteByQuizId(Long id);



}
