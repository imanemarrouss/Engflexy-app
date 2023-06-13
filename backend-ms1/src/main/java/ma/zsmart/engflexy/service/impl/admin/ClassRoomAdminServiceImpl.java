package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.ClassRoom;
import ma.zsmart.engflexy.bean.core.EtudiantClassRoom;
import ma.zsmart.engflexy.bean.core.QuizClassRoom;
import ma.zsmart.engflexy.bean.history.ClassRoomHistory;
import ma.zsmart.engflexy.dao.criteria.core.ClassRoomCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ClassRoomHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ClassRoomDao;
import ma.zsmart.engflexy.dao.facade.history.ClassRoomHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ClassRoomSpecification;
import ma.zsmart.engflexy.service.facade.admin.ClassRoomAdminService;
import ma.zsmart.engflexy.service.facade.admin.EtudiantClassRoomAdminService;
import ma.zsmart.engflexy.service.facade.admin.ProfAdminService;
import ma.zsmart.engflexy.service.facade.admin.QuizClassRoomAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ClassRoomAdminServiceImpl extends AbstractServiceImpl<ClassRoom,ClassRoomHistory, ClassRoomCriteria, ClassRoomHistoryCriteria, ClassRoomDao,
ClassRoomHistoryDao> implements ClassRoomAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public ClassRoom create(ClassRoom t) {
        super.create(t);
        if (t.getEtudiantClassRooms() != null) {
                t.getEtudiantClassRooms().forEach(element-> {
                    element.setClassRoom(t);
                    etudiantClassRoomService.create(element);
            });
        }
        if (t.getQuizClassRooms() != null) {
                t.getQuizClassRooms().forEach(element-> {
                    element.setClassRoom(t);
                    quizClassRoomService.create(element);
            });
        }
        return t;
    }

    public ClassRoom findWithAssociatedLists(Long id){
        ClassRoom result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setEtudiantClassRooms(etudiantClassRoomService.findByClassRoomId(id));
            result.setQuizClassRooms(quizClassRoomService.findByClassRoomId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        etudiantClassRoomService.deleteByClassRoomId(id);
        quizClassRoomService.deleteByClassRoomId(id);
    }


    public void updateWithAssociatedLists(ClassRoom classRoom){
    if(classRoom !=null && classRoom.getId() != null){
            List<List<EtudiantClassRoom>> resultEtudiantClassRooms= etudiantClassRoomService.getToBeSavedAndToBeDeleted(etudiantClassRoomService.findByClassRoomId(classRoom.getId()),classRoom.getEtudiantClassRooms());
            etudiantClassRoomService.delete(resultEtudiantClassRooms.get(1));
            ListUtil.emptyIfNull(resultEtudiantClassRooms.get(0)).forEach(e -> e.setClassRoom(classRoom));
            etudiantClassRoomService.update(resultEtudiantClassRooms.get(0),true);
            List<List<QuizClassRoom>> resultQuizClassRooms= quizClassRoomService.getToBeSavedAndToBeDeleted(quizClassRoomService.findByClassRoomId(classRoom.getId()),classRoom.getQuizClassRooms());
            quizClassRoomService.delete(resultQuizClassRooms.get(1));
            ListUtil.emptyIfNull(resultQuizClassRooms.get(0)).forEach(e -> e.setClassRoom(classRoom));
            quizClassRoomService.update(resultQuizClassRooms.get(0),true);
    }
    }


    public List<ClassRoom> findByProfId(Long id){
        return dao.findByProfId(id);
    }
    public int deleteByProfId(Long id){
        return dao.deleteByProfId(id);
    }



    public void configure() {
        super.configure(ClassRoom.class,ClassRoomHistory.class, ClassRoomHistoryCriteria.class, ClassRoomSpecification.class);
    }

    @Autowired
    private ProfAdminService profService ;
    @Autowired
    private EtudiantClassRoomAdminService etudiantClassRoomService ;
    @Autowired
    private QuizClassRoomAdminService quizClassRoomService ;

    public ClassRoomAdminServiceImpl(ClassRoomDao dao, ClassRoomHistoryDao historyDao) {
        super(dao, historyDao);
    }

}