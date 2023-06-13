package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.CategorieSection;
import ma.zsmart.engflexy.bean.core.Cours;
import ma.zsmart.engflexy.bean.history.CoursHistory;
import ma.zsmart.engflexy.dao.criteria.core.CoursCriteria;
import ma.zsmart.engflexy.dao.criteria.history.CoursHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.CoursDao;
import ma.zsmart.engflexy.dao.facade.history.CoursHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.CoursSpecification;
import ma.zsmart.engflexy.service.facade.admin.*;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.zsmart.engflexy.bean.core.Section;
import ma.zsmart.engflexy.bean.core.HomeWork;


import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class CoursAdminServiceImpl extends AbstractServiceImpl<Cours,CoursHistory, CoursCriteria, CoursHistoryCriteria, CoursDao,
        CoursHistoryDao> implements CoursAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Cours create(Cours t) {
        super.create(t);
        if (t.getSections() != null) {
            t.getSections().forEach(element-> {
                element.setCours(t);
                sectionService.create(element);
            });
        }
        if (t.getHomeWorks() != null) {
            t.getHomeWorks().forEach(element-> {
                element.setCours(t);
                homeWorkService.create(element);
            });
        }
        else {
            List<CategorieSection> categorieSections = categorieSectionAdminService.findAll();
            for (CategorieSection categorieSection : categorieSections) {
                Section section = new Section();
                section.setCours(t);
                section.setCategorieSection(categorieSection);
                sectionService.create(section);
            }
            t.setNombreSectionEnCours(categorieSectionAdminService.count());
        }
        return t;
    }

    public Cours findWithAssociatedLists(Long id){
        Cours result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setSections(sectionService.findByCoursId(id));
            result.setHomeWorks(homeWorkService.findByCoursId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        sectionService.deleteByCoursId(id);
        homeWorkService.deleteByCoursId(id);
    }


    public void updateWithAssociatedLists(Cours cours){
        if(cours !=null && cours.getId() != null){
            List<List<Section>> resultSections= sectionService.getToBeSavedAndToBeDeleted(sectionService.findByCoursId(cours.getId()),cours.getSections());
            sectionService.delete(resultSections.get(1));
            ListUtil.emptyIfNull(resultSections.get(0)).forEach(e -> e.setCours(cours));
            sectionService.update(resultSections.get(0),true);
            List<List<HomeWork>> resultHomeWorks= homeWorkService.getToBeSavedAndToBeDeleted(homeWorkService.findByCoursId(cours.getId()),cours.getHomeWorks());
            homeWorkService.delete(resultHomeWorks.get(1));
            ListUtil.emptyIfNull(resultHomeWorks.get(0)).forEach(e -> e.setCours(cours));
            homeWorkService.update(resultHomeWorks.get(0),true);

            AtomicInteger sectionValide = new AtomicInteger(0);
            AtomicLong sectionNvalide = new AtomicLong(categorieSectionAdminService.count());
            if (cours.getSections() != null) {
                cours.getSections().forEach(element -> {
                    if (element.getCode() != null && element.getLibelle() != null) {
                        sectionValide.incrementAndGet();
                        sectionNvalide.decrementAndGet();
                    }
                });
                cours.setNombreSectionFinalise(sectionValide.get());
                cours.setNombreSectionEnCours(sectionNvalide.get());
            }
        }
    }

    public Cours findByReferenceEntity(Cours t){
        return  dao.findByCode(t.getCode());
    }

    public List<Cours> findByEtatCoursId(Long id){
        return dao.findByEtatCoursId(id);
    }
    public int deleteByEtatCoursId(Long id){
        return dao.deleteByEtatCoursId(id);
    }
    public List<Cours> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }



    public void configure() {
        super.configure(Cours.class,CoursHistory.class, CoursHistoryCriteria.class, CoursSpecification.class);
    }
    @Autowired
    private CategorieSectionAdminServiceImpl categorieSectionAdminService;
    @Autowired
    private ParcoursAdminService parcoursService ;
    @Autowired
    private EtatCoursAdminService etatCoursService ;
    @Autowired
    private SectionAdminService sectionService ;
    @Autowired
    private HomeWorkAdminService homeWorkService ;

    public CoursAdminServiceImpl(CoursDao dao, CoursHistoryDao historyDao) {
        super(dao, historyDao);
    }

}