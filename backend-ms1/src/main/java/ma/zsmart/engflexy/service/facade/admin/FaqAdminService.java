package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Faq;
import ma.zsmart.engflexy.dao.criteria.core.FaqCriteria;
import ma.zsmart.engflexy.dao.criteria.history.FaqHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface FaqAdminService extends  IService<Faq,FaqCriteria, FaqHistoryCriteria>  {

    List<Faq> findByFaqTypeId(Long id);
    int deleteByFaqTypeId(Long id);



}
