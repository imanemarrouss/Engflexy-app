package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.ReclamationProfHistory;
import ma.zsmart.engflexy.dao.criteria.history.ReclamationProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class ReclamationProfHistorySpecification extends AbstractHistorySpecification<ReclamationProfHistoryCriteria, ReclamationProfHistory> {

    public ReclamationProfHistorySpecification(ReclamationProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationProfHistorySpecification(ReclamationProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
