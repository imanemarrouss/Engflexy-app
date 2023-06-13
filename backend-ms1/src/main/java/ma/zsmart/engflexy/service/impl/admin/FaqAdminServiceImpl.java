package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Faq;
import ma.zsmart.engflexy.bean.history.FaqHistory;
import ma.zsmart.engflexy.dao.criteria.core.FaqCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FaqHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.FaqDao;
import ma.zsmart.engflexy.dao.facade.history.FaqHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.FaqSpecification;
import ma.zsmart.engflexy.service.facade.admin.FaqAdminService;
import ma.zsmart.engflexy.service.facade.admin.FaqTypeAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FaqAdminServiceImpl extends AbstractServiceImpl<Faq,FaqHistory, FaqCriteria, FaqHistoryCriteria, FaqDao,
FaqHistoryDao> implements FaqAdminService {



    public List<Faq> findByFaqTypeId(Long id){
        return dao.findByFaqTypeId(id);
    }
    public int deleteByFaqTypeId(Long id){
        return dao.deleteByFaqTypeId(id);
    }



    public void configure() {
        super.configure(Faq.class,FaqHistory.class, FaqHistoryCriteria.class, FaqSpecification.class);
    }

    @Autowired
    private FaqTypeAdminService faqTypeService ;

    public FaqAdminServiceImpl(FaqDao dao, FaqHistoryDao historyDao) {
        super(dao, historyDao);
    }

}