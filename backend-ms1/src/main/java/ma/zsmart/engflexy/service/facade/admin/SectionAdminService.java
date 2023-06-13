package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Section;
import ma.zsmart.engflexy.dao.criteria.core.SectionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.SectionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface SectionAdminService extends  IService<Section,SectionCriteria, SectionHistoryCriteria>  {

    List<Section> findByCategorieSectionId(Long id);
    int deleteByCategorieSectionId(Long id);
    List<Section> findByCoursId(Long id);
    int deleteByCoursId(Long id);
    List<Section> findBySessionCoursId(Long id);
    int deleteBySessionCoursId(Long id);



}
