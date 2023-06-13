package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.QuizClassRoom;
import ma.zsmart.engflexy.bean.history.QuizClassRoomHistory;
import ma.zsmart.engflexy.dao.criteria.core.QuizClassRoomCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuizClassRoomHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.QuizClassRoomDao;
import ma.zsmart.engflexy.dao.facade.history.QuizClassRoomHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.QuizClassRoomSpecification;
import ma.zsmart.engflexy.service.facade.admin.ClassRoomAdminService;
import ma.zsmart.engflexy.service.facade.admin.QuizAdminService;
import ma.zsmart.engflexy.service.facade.admin.QuizClassRoomAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizClassRoomAdminServiceImpl extends AbstractServiceImpl<QuizClassRoom,QuizClassRoomHistory, QuizClassRoomCriteria, QuizClassRoomHistoryCriteria, QuizClassRoomDao,
QuizClassRoomHistoryDao> implements QuizClassRoomAdminService {



    public List<QuizClassRoom> findByClassRoomId(Long id){
        return dao.findByClassRoomId(id);
    }
    public int deleteByClassRoomId(Long id){
        return dao.deleteByClassRoomId(id);
    }
    public List<QuizClassRoom> findByQuizId(Long id){
        return dao.findByQuizId(id);
    }
    public int deleteByQuizId(Long id){
        return dao.deleteByQuizId(id);
    }



    public void configure() {
        super.configure(QuizClassRoom.class,QuizClassRoomHistory.class, QuizClassRoomHistoryCriteria.class, QuizClassRoomSpecification.class);
    }

    @Autowired
    private ClassRoomAdminService classRoomService ;
    @Autowired
    private QuizAdminService quizService ;

    public QuizClassRoomAdminServiceImpl(QuizClassRoomDao dao, QuizClassRoomHistoryDao historyDao) {
        super(dao, historyDao);
    }

}