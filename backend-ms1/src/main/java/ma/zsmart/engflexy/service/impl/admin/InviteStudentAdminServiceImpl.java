package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.InviteStudent;
import ma.zsmart.engflexy.bean.history.InviteStudentHistory;
import ma.zsmart.engflexy.dao.criteria.core.InviteStudentCriteria;
import ma.zsmart.engflexy.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.InviteStudentDao;
import ma.zsmart.engflexy.dao.facade.history.InviteStudentHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.InviteStudentSpecification;
import ma.zsmart.engflexy.service.facade.admin.EtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.InviteStudentAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InviteStudentAdminServiceImpl extends AbstractServiceImpl<InviteStudent,InviteStudentHistory, InviteStudentCriteria, InviteStudentHistoryCriteria, InviteStudentDao,
InviteStudentHistoryDao> implements InviteStudentAdminService {


    public InviteStudent findByReferenceEntity(InviteStudent t){
        return  dao.findByCode(t.getCode());
    }

    public List<InviteStudent> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }



    public void configure() {
        super.configure(InviteStudent.class,InviteStudentHistory.class, InviteStudentHistoryCriteria.class, InviteStudentSpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;

    public InviteStudentAdminServiceImpl(InviteStudentDao dao, InviteStudentHistoryDao historyDao) {
        super(dao, historyDao);
    }

}