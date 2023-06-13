package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Dictionary;
import ma.zsmart.engflexy.bean.history.DictionaryHistory;
import ma.zsmart.engflexy.dao.criteria.core.DictionaryCriteria;
import ma.zsmart.engflexy.dao.criteria.history.DictionaryHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.DictionaryDao;
import ma.zsmart.engflexy.dao.facade.history.DictionaryHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.DictionarySpecification;
import ma.zsmart.engflexy.service.facade.admin.DictionaryAdminService;
import ma.zsmart.engflexy.service.facade.admin.EtudiantAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DictionaryAdminServiceImpl extends AbstractServiceImpl<Dictionary,DictionaryHistory, DictionaryCriteria, DictionaryHistoryCriteria, DictionaryDao,
DictionaryHistoryDao> implements DictionaryAdminService {



    public List<Dictionary> findByEtudiantId(Long id){
        return dao.findByEtudiantId(id);
    }
    public int deleteByEtudiantId(Long id){
        return dao.deleteByEtudiantId(id);
    }



    public void configure() {
        super.configure(Dictionary.class,DictionaryHistory.class, DictionaryHistoryCriteria.class, DictionarySpecification.class);
    }

    @Autowired
    private EtudiantAdminService etudiantService ;

    public DictionaryAdminServiceImpl(DictionaryDao dao, DictionaryHistoryDao historyDao) {
        super(dao, historyDao);
    }

}