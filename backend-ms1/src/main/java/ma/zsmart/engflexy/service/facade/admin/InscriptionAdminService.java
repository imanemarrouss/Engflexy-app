package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Inscription;
import ma.zsmart.engflexy.dao.criteria.core.InscriptionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.InscriptionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface InscriptionAdminService extends  IService<Inscription,InscriptionCriteria, InscriptionHistoryCriteria>  {

    List<Inscription> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<Inscription> findByEtatInscriptionId(Long id);
    int deleteByEtatInscriptionId(Long id);
    List<Inscription> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<Inscription> findByGroupeEtudeId(Long id);
    int deleteByGroupeEtudeId(Long id);
    List<Inscription> findByStatutSocialId(Long id);
    int deleteByStatutSocialId(Long id);
    List<Inscription> findByInteretEtudiantId(Long id);
    int deleteByInteretEtudiantId(Long id);
    List<Inscription> findByNiveauEtudeId(Long id);
    int deleteByNiveauEtudeId(Long id);
    List<Inscription> findByFonctionId(Long id);
    int deleteByFonctionId(Long id);
    List<Inscription> findByQuizId(Long id);
    int deleteByQuizId(Long id);
    List<Inscription> findByPackStudentId(Long id);
    int deleteByPackStudentId(Long id);
    List<Inscription> findBySkillId(Long id);
    int deleteBySkillId(Long id);



}
