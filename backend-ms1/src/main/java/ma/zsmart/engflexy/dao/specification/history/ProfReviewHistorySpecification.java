package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.ProfReviewHistory;
import ma.zsmart.engflexy.dao.criteria.history.ProfReviewHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class ProfReviewHistorySpecification extends AbstractHistorySpecification<ProfReviewHistoryCriteria, ProfReviewHistory> {

    public ProfReviewHistorySpecification(ProfReviewHistoryCriteria criteria) {
        super(criteria);
    }

    public ProfReviewHistorySpecification(ProfReviewHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
