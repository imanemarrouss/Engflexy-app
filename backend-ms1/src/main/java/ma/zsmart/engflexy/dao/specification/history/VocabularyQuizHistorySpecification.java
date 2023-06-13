package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.VocabularyQuizHistory;
import ma.zsmart.engflexy.dao.criteria.history.VocabularyQuizHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class VocabularyQuizHistorySpecification extends AbstractHistorySpecification<VocabularyQuizHistoryCriteria, VocabularyQuizHistory> {

    public VocabularyQuizHistorySpecification(VocabularyQuizHistoryCriteria criteria) {
        super(criteria);
    }

    public VocabularyQuizHistorySpecification(VocabularyQuizHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
