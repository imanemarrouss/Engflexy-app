package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.Etudiant;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EtudiantDao extends AbstractRepository<Etudiant,Long>  {
    Etudiant findByRef(String ref);
    int deleteByRef(String ref);

    List<Etudiant> findByTeacherLocalityId(Long id);
    int deleteByTeacherLocalityId(Long id);
    List<Etudiant> findByEtatEtudiantScheduleId(Long id);
    int deleteByEtatEtudiantScheduleId(Long id);
    List<Etudiant> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<Etudiant> findByGroupeEtudeId(Long id);
    int deleteByGroupeEtudeId(Long id);
    List<Etudiant> findByPackStudentId(Long id);
    int deleteByPackStudentId(Long id);
    List<Etudiant> findByStatutSocialId(Long id);
    int deleteByStatutSocialId(Long id);
    List<Etudiant> findByInteretEtudiantId(Long id);
    int deleteByInteretEtudiantId(Long id);
    List<Etudiant> findByNiveauEtudeId(Long id);
    int deleteByNiveauEtudeId(Long id);
    List<Etudiant> findBySkillId(Long id);
    int deleteBySkillId(Long id);
    List<Etudiant> findByFonctionId(Long id);
    int deleteByFonctionId(Long id);
    List<Etudiant> findByLangueId(Long id);
    int deleteByLangueId(Long id);

    @Query("SELECT NEW Etudiant(item.id,item.ref) FROM Etudiant item")
    List<Etudiant> findAllOptimized();
}
