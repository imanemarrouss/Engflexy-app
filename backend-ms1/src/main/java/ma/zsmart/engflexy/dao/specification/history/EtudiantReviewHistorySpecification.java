package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.EtudiantReviewHistory;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantReviewHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class EtudiantReviewHistorySpecification extends AbstractHistorySpecification<EtudiantReviewHistoryCriteria, EtudiantReviewHistory> {

    public EtudiantReviewHistorySpecification(EtudiantReviewHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantReviewHistorySpecification(EtudiantReviewHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
