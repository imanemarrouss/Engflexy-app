package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.SectionItem;
import ma.zsmart.engflexy.dao.criteria.core.SectionItemCriteria;
import ma.zsmart.engflexy.dao.criteria.history.SectionItemHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface SectionItemAdminService extends  IService<SectionItem,SectionItemCriteria, SectionItemHistoryCriteria>  {

    List<SectionItem> findBySectionId(Long id);
    int deleteBySectionId(Long id);



}
