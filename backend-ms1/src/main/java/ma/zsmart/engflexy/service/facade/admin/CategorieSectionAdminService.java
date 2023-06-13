package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.CategorieSection;
import ma.zsmart.engflexy.dao.criteria.core.CategorieSectionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface CategorieSectionAdminService extends  IService<CategorieSection,CategorieSectionCriteria, CategorieSectionHistoryCriteria>  {

    List<CategorieSection> findBySuperCategorieSectionId(Long id);
    int deleteBySuperCategorieSectionId(Long id);



}
