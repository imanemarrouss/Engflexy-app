package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.DictionaryHistory;
import ma.zsmart.engflexy.dao.criteria.history.DictionaryHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class DictionaryHistorySpecification extends AbstractHistorySpecification<DictionaryHistoryCriteria, DictionaryHistory> {

    public DictionaryHistorySpecification(DictionaryHistoryCriteria criteria) {
        super(criteria);
    }

    public DictionaryHistorySpecification(DictionaryHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
