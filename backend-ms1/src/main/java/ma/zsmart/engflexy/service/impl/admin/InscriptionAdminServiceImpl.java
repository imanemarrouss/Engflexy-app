package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Inscription;
import ma.zsmart.engflexy.bean.history.InscriptionHistory;
import ma.zsmart.engflexy.dao.criteria.core.InscriptionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.InscriptionHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.InscriptionDao;
import ma.zsmart.engflexy.dao.facade.history.InscriptionHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.InscriptionSpecification;
import ma.zsmart.engflexy.service.facade.admin.*;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InscriptionAdminServiceImpl extends AbstractServiceImpl<Inscription,InscriptionHistory, InscriptionCriteria, InscriptionHistoryCriteria, InscriptionDao,
InscriptionHistoryDao> implements InscriptionAdminService {



    public List<Inscription> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }
    public List<Inscription> findByEtatInscriptionId(Long id){
        return dao.findByEtatInscriptionId(id);
    }
    public int deleteByEtatInscriptionId(Long id){
        return dao.deleteByEtatInscriptionId(id);
    }
    public List<Inscription> findByParcoursId(Long id){
        return dao.findByParcoursId(id);
    }
    public int deleteByParcoursId(Long id){
        return dao.deleteByParcoursId(id);
    }
    public List<Inscription> findByGroupeEtudeId(Long id){
        return dao.findByGroupeEtudeId(id);
    }
    public int deleteByGroupeEtudeId(Long id){
        return dao.deleteByGroupeEtudeId(id);
    }
    public List<Inscription> findByStatutSocialId(Long id){
        return dao.findByStatutSocialId(id);
    }
    public int deleteByStatutSocialId(Long id){
        return dao.deleteByStatutSocialId(id);
    }
    public List<Inscription> findByInteretEtudiantId(Long id){
        return dao.findByInteretEtudiantId(id);
    }
    public int deleteByInteretEtudiantId(Long id){
        return dao.deleteByInteretEtudiantId(id);
    }
    public List<Inscription> findByNiveauEtudeId(Long id){
        return dao.findByNiveauEtudeId(id);
    }
    public int deleteByNiveauEtudeId(Long id){
        return dao.deleteByNiveauEtudeId(id);
    }
    public List<Inscription> findByFonctionId(Long id){
        return dao.findByFonctionId(id);
    }
    public int deleteByFonctionId(Long id){
        return dao.deleteByFonctionId(id);
    }
    public List<Inscription> findByQuizId(Long id){
        return dao.findByQuizId(id);
    }
    public int deleteByQuizId(Long id){
        return dao.deleteByQuizId(id);
    }
    public List<Inscription> findByPackStudentId(Long id){
        return dao.findByPackStudentId(id);
    }
    public int deleteByPackStudentId(Long id){
        return dao.deleteByPackStudentId(id);
    }
    public List<Inscription> findBySkillId(Long id){
        return dao.findBySkillId(id);
    }
    public int deleteBySkillId(Long id){
        return dao.deleteBySkillId(id);
    }



    public void configure() {
        super.configure(Inscription.class,InscriptionHistory.class, InscriptionHistoryCriteria.class, InscriptionSpecification.class);
    }

    @Autowired
    private ParcoursAdminService parcoursService ;
    @Autowired
    private FonctionAdminService fonctionService ;
    @Autowired
    private EtudiantAdminService etudiantService ;
    @Autowired
    private GroupeEtudeAdminService groupeEtudeService ;
    @Autowired
    private QuizAdminService quizService ;
    @Autowired
    private NiveauEtudeAdminService niveauEtudeService ;
    @Autowired
    private PackStudentAdminService packStudentService ;
    @Autowired
    private SkillAdminService skillService ;
    @Autowired
    private EtatInscriptionAdminService etatInscriptionService ;
    @Autowired
    private StatutSocialAdminService statutSocialService ;
    @Autowired
    private InteretEtudiantAdminService interetEtudiantService ;

    public InscriptionAdminServiceImpl(InscriptionDao dao, InscriptionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}