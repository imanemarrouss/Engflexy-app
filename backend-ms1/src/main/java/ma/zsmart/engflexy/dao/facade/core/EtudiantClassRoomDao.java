package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.EtudiantClassRoom;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EtudiantClassRoomDao extends AbstractRepository<EtudiantClassRoom,Long>  {

    List<EtudiantClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<EtudiantClassRoom> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);

}
