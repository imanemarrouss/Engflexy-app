package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.ClassRoom;
import ma.zsmart.engflexy.bean.core.Prof;
import ma.zsmart.engflexy.bean.core.RecommendTeacher;
import ma.zsmart.engflexy.bean.core.TrancheHoraireProf;
import ma.zsmart.engflexy.bean.history.ProfHistory;
import ma.zsmart.engflexy.dao.criteria.core.ProfCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ProfHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ProfDao;
import ma.zsmart.engflexy.dao.facade.history.ProfHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ProfSpecification;
import ma.zsmart.engflexy.service.facade.admin.*;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ProfAdminServiceImpl extends AbstractServiceImpl<Prof,ProfHistory, ProfCriteria, ProfHistoryCriteria, ProfDao,
ProfHistoryDao> implements ProfAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Prof create(Prof t) {
        super.create(t);
        if (t.getTrancheHoraireProfs() != null) {
                t.getTrancheHoraireProfs().forEach(element-> {
                    element.setProf(t);
                    trancheHoraireProfService.create(element);
            });
        }
        if (t.getClassRooms() != null) {
                t.getClassRooms().forEach(element-> {
                    element.setProf(t);
                    classRoomService.create(element);
            });
        }
        if (t.getRecommendTeachers() != null) {
                t.getRecommendTeachers().forEach(element-> {
                    element.setProf(t);
                    recommendTeacherService.create(element);
            });
        }
        return t;
    }

    public Prof findWithAssociatedLists(Long id){
        Prof result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setTrancheHoraireProfs(trancheHoraireProfService.findByProfId(id));
            result.setClassRooms(classRoomService.findByProfId(id));
            result.setRecommendTeachers(recommendTeacherService.findByProfId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        trancheHoraireProfService.deleteByProfId(id);
        classRoomService.deleteByProfId(id);
        recommendTeacherService.deleteByProfId(id);
    }


    public void updateWithAssociatedLists(Prof prof){
    if(prof !=null && prof.getId() != null){
            List<List<TrancheHoraireProf>> resultTrancheHoraireProfs= trancheHoraireProfService.getToBeSavedAndToBeDeleted(trancheHoraireProfService.findByProfId(prof.getId()),prof.getTrancheHoraireProfs());
            trancheHoraireProfService.delete(resultTrancheHoraireProfs.get(1));
            ListUtil.emptyIfNull(resultTrancheHoraireProfs.get(0)).forEach(e -> e.setProf(prof));
            trancheHoraireProfService.update(resultTrancheHoraireProfs.get(0),true);
            List<List<ClassRoom>> resultClassRooms= classRoomService.getToBeSavedAndToBeDeleted(classRoomService.findByProfId(prof.getId()),prof.getClassRooms());
            classRoomService.delete(resultClassRooms.get(1));
            ListUtil.emptyIfNull(resultClassRooms.get(0)).forEach(e -> e.setProf(prof));
            classRoomService.update(resultClassRooms.get(0),true);
            List<List<RecommendTeacher>> resultRecommendTeachers= recommendTeacherService.getToBeSavedAndToBeDeleted(recommendTeacherService.findByProfId(prof.getId()),prof.getRecommendTeachers());
            recommendTeacherService.delete(resultRecommendTeachers.get(1));
            ListUtil.emptyIfNull(resultRecommendTeachers.get(0)).forEach(e -> e.setProf(prof));
            recommendTeacherService.update(resultRecommendTeachers.get(0),true);
    }
    }

    public Prof findByReferenceEntity(Prof t){
        return  dao.findByRef(t.getRef());
    }

    public List<Prof> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }
    public List<Prof> findByCategorieProfId(Long id){
        return dao.findByCategorieProfId(id);
    }
    public int deleteByCategorieProfId(Long id){
        return dao.deleteByCategorieProfId(id);
    }
    public List<Prof> findByTypeTeacherId(Long id){
        return dao.findByTypeTeacherId(id);
    }
    public int deleteByTypeTeacherId(Long id){
        return dao.deleteByTypeTeacherId(id);
    }



    public void configure() {
        super.configure(Prof.class,ProfHistory.class, ProfHistoryCriteria.class, ProfSpecification.class);
    }

    @Autowired
    private ParcoursAdminService parcoursService ;
    @Autowired
    private TypeTeacherAdminService typeTeacherService ;
    @Autowired
    private CategorieProfAdminService categorieProfService ;
    @Autowired
    private ClassRoomAdminService classRoomService ;
    @Autowired
    private RecommendTeacherAdminService recommendTeacherService ;
    @Autowired
    private TrancheHoraireProfAdminService trancheHoraireProfService ;

    public ProfAdminServiceImpl(ProfDao dao, ProfHistoryDao historyDao) {
        super(dao, historyDao);
    }

}