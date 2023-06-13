package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.HomeWorkEtudiant;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HomeWorkEtudiantDao extends AbstractRepository<HomeWorkEtudiant,Long>  {

    List<HomeWorkEtudiant> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);
    List<HomeWorkEtudiant> findByHomeWorkId(Long id);
    int deleteByHomeWorkId(Long id);
    List<HomeWorkEtudiant> findByResultatHomeWorkId(Long id);
    int deleteByResultatHomeWorkId(Long id);

}
