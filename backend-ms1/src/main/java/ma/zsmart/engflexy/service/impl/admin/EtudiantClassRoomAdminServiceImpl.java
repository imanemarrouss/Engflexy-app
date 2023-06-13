package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.EtudiantClassRoom;
import ma.zsmart.engflexy.bean.history.EtudiantClassRoomHistory;
import ma.zsmart.engflexy.dao.criteria.core.EtudiantClassRoomCriteria;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantClassRoomHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.EtudiantClassRoomDao;
import ma.zsmart.engflexy.dao.facade.history.EtudiantClassRoomHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.EtudiantClassRoomSpecification;
import ma.zsmart.engflexy.service.facade.admin.ClassRoomAdminService;
import ma.zsmart.engflexy.service.facade.admin.EtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.EtudiantClassRoomAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EtudiantClassRoomAdminServiceImpl extends AbstractServiceImpl<EtudiantClassRoom,EtudiantClassRoomHistory, EtudiantClassRoomCriteria, EtudiantClassRoomHistoryCriteria, EtudiantClassRoomDao,
EtudiantClassRoomHistoryDao> implements EtudiantClassRoomAdminService {



    public List<EtudiantClassRoom> findByClassRoomId(Long id){
        return dao.findByClassRoomId(id);
    }
    public int deleteByClassRoomId(Long id){
        return dao.deleteByClassRoomId(id);
    }
    public List<EtudiantClassRoom> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }



    public void configure() {
        super.configure(EtudiantClassRoom.class,EtudiantClassRoomHistory.class, EtudiantClassRoomHistoryCriteria.class, EtudiantClassRoomSpecification.class);
    }

    @Autowired
    private ClassRoomAdminService classRoomService ;
    @Autowired
    private EtudiantAdminService etudiantService ;

    public EtudiantClassRoomAdminServiceImpl(EtudiantClassRoomDao dao, EtudiantClassRoomHistoryDao historyDao) {
        super(dao, historyDao);
    }

}