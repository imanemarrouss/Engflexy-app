package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Vocabulary;
import ma.zsmart.engflexy.bean.history.VocabularyHistory;
import ma.zsmart.engflexy.dao.criteria.core.VocabularyCriteria;
import ma.zsmart.engflexy.dao.criteria.history.VocabularyHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.VocabularyDao;
import ma.zsmart.engflexy.dao.facade.history.VocabularyHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.VocabularySpecification;
import ma.zsmart.engflexy.service.facade.admin.SectionAdminService;
import ma.zsmart.engflexy.service.facade.admin.VocabularyAdminService;
import ma.zsmart.engflexy.service.facade.admin.VocabularyQuizAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VocabularyAdminServiceImpl extends AbstractServiceImpl<Vocabulary,VocabularyHistory, VocabularyCriteria, VocabularyHistoryCriteria, VocabularyDao,
VocabularyHistoryDao> implements VocabularyAdminService {



    public List<Vocabulary> findBySectionId(Long id){
        return dao.findBySectionId(id);
    }
    public int deleteBySectionId(Long id){
        return dao.deleteBySectionId(id);
    }
    public List<Vocabulary> findByVocabularyQuizId(Long id){
        return dao.findByVocabularyQuizId(id);
    }
    public int deleteByVocabularyQuizId(Long id){
        return dao.deleteByVocabularyQuizId(id);
    }



    public void configure() {
        super.configure(Vocabulary.class,VocabularyHistory.class, VocabularyHistoryCriteria.class, VocabularySpecification.class);
    }

    @Autowired
    private SectionAdminService sectionService ;
    @Autowired
    private VocabularyQuizAdminService vocabularyQuizService ;

    public VocabularyAdminServiceImpl(VocabularyDao dao, VocabularyHistoryDao historyDao) {
        super(dao, historyDao);
    }

}