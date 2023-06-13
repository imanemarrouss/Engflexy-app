package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.GroupeEtudiant;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GroupeEtudiantDao extends AbstractRepository<GroupeEtudiant,Long>  {

    List<GroupeEtudiant> findByGroupeEtudeId(Long id);
    int deleteByGroupeEtudeId(Long id);
    List<GroupeEtudiant> findByParcoursId(Long id);
    int deleteByParcoursId(Long id);
    List<GroupeEtudiant> findByProfId(Long id);
    int deleteByProfId(Long id);

}
