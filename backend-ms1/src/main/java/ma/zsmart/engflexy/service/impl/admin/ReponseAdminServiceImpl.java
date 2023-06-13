package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.EtatReponse;
import ma.zsmart.engflexy.bean.core.Reponse;
import ma.zsmart.engflexy.bean.history.ReponseHistory;
import ma.zsmart.engflexy.dao.criteria.core.ReponseCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ReponseHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ReponseDao;
import ma.zsmart.engflexy.dao.facade.history.ReponseHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ReponseSpecification;
import ma.zsmart.engflexy.service.facade.admin.EtatReponseAdminService;
import ma.zsmart.engflexy.service.facade.admin.QuestionAdminService;
import ma.zsmart.engflexy.service.facade.admin.ReponseAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class ReponseAdminServiceImpl extends AbstractServiceImpl<Reponse,ReponseHistory, ReponseCriteria, ReponseHistoryCriteria, ReponseDao,
ReponseHistoryDao> implements ReponseAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Reponse create(Reponse t) {
        super.create(t);
        if (t.getEtatReponse() != null) {
            EtatReponse element = t.getEtatReponse();
            t.setEtatReponse(element);
            etatReponseService.create(element);
        }
        return t;
    }
    public Reponse findByReferenceEntity(Reponse t){
        return  dao.findByRef(t.getRef());
    }

    public List<Reponse> findByEtatReponseId(Long id){
        return dao.findByEtatReponseId(id);
    }
    public int deleteByEtatReponseId(Long id){
        return dao.deleteByEtatReponseId(id);
    }
    public List<Reponse> findByQuestionId(Long id){
        return dao.findByQuestionId(id);
    }
    public int deleteByQuestionId(Long id){
        return dao.deleteByQuestionId(id);
    }



    public void configure() {
        super.configure(Reponse.class,ReponseHistory.class, ReponseHistoryCriteria.class, ReponseSpecification.class);
    }

    @Autowired
    private QuestionAdminService questionService ;
    @Autowired
    private EtatReponseAdminService etatReponseService ;

    public ReponseAdminServiceImpl(ReponseDao dao, ReponseHistoryDao historyDao) {
        super(dao, historyDao);
    }

}