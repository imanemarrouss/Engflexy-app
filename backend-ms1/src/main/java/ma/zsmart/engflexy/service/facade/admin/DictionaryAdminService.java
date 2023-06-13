package ma.zsmart.engflexy.service.facade.admin;

import ma.zsmart.engflexy.bean.core.Dictionary;
import ma.zsmart.engflexy.dao.criteria.core.DictionaryCriteria;
import ma.zsmart.engflexy.dao.criteria.history.DictionaryHistoryCriteria;
import ma.zsmart.engflexy.zynerator.service.IService;

import java.util.List;


public interface DictionaryAdminService extends  IService<Dictionary,DictionaryCriteria, DictionaryHistoryCriteria>  {

    List<Dictionary> findByEtudiantId(Long id);
    int deleteByEtudiantId(Long id);



}
