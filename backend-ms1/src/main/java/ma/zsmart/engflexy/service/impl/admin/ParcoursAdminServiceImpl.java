package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Cours;
import ma.zsmart.engflexy.bean.core.Etudiant;
import ma.zsmart.engflexy.bean.core.Parcours;
import ma.zsmart.engflexy.bean.history.ParcoursHistory;
import ma.zsmart.engflexy.dao.criteria.core.ParcoursCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ParcoursHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ParcoursDao;
import ma.zsmart.engflexy.dao.facade.history.ParcoursHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ParcoursSpecification;
import ma.zsmart.engflexy.service.facade.admin.CentreAdminService;
import ma.zsmart.engflexy.service.facade.admin.CoursAdminService;
import ma.zsmart.engflexy.service.facade.admin.EtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.ParcoursAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ParcoursAdminServiceImpl extends AbstractServiceImpl<Parcours,ParcoursHistory, ParcoursCriteria, ParcoursHistoryCriteria, ParcoursDao,
ParcoursHistoryDao> implements ParcoursAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Parcours create(Parcours t) {
        super.create(t);
        if (t.getCourss() != null) {
                t.getCourss().forEach(element-> {
                    element.setParcours(t);
                    coursService.create(element);
            });
        }
        if (t.getEtudiants() != null) {
                t.getEtudiants().forEach(element-> {
                    element.setParcours(t);
                    etudiantService.create(element);
            });
        }
        return t;
    }

    public Parcours findWithAssociatedLists(Long id){
        Parcours result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setCourss(coursService.findByParcoursId(id));
            result.setEtudiants(etudiantService.findByParcoursId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        coursService.deleteByParcoursId(id);
        etudiantService.deleteByParcoursId(id);
    }


    public void updateWithAssociatedLists(Parcours parcours){
    if(parcours !=null && parcours.getId() != null){
            List<List<Cours>> resultCourss= coursService.getToBeSavedAndToBeDeleted(coursService.findByParcoursId(parcours.getId()),parcours.getCourss());
            coursService.delete(resultCourss.get(1));
            ListUtil.emptyIfNull(resultCourss.get(0)).forEach(e -> e.setParcours(parcours));
            coursService.update(resultCourss.get(0),true);
            List<List<Etudiant>> resultEtudiants= etudiantService.getToBeSavedAndToBeDeleted(etudiantService.findByParcoursId(parcours.getId()),parcours.getEtudiants());
            etudiantService.delete(resultEtudiants.get(1));
            ListUtil.emptyIfNull(resultEtudiants.get(0)).forEach(e -> e.setParcours(parcours));
            etudiantService.update(resultEtudiants.get(0),true);
    }
    }

    public Parcours findByReferenceEntity(Parcours t){
        return  dao.findByCode(t.getCode());
    }

    public List<Parcours> findByCentreId(Long id){
        return dao.findByCentreId(id);
    }
    public int deleteByCentreId(Long id){
        return dao.deleteByCentreId(id);
    }



    public void configure() {
        super.configure(Parcours.class,ParcoursHistory.class, ParcoursHistoryCriteria.class, ParcoursSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private CoursAdminService coursService ;
    @Autowired
    private CentreAdminService centreService ;

    public ParcoursAdminServiceImpl(ParcoursDao dao, ParcoursHistoryDao historyDao) {
        super(dao, historyDao);
    }

}