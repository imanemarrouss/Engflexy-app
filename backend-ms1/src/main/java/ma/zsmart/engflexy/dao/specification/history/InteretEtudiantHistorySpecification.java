package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.InteretEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.history.InteretEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class InteretEtudiantHistorySpecification extends AbstractHistorySpecification<InteretEtudiantHistoryCriteria, InteretEtudiantHistory> {

    public InteretEtudiantHistorySpecification(InteretEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public InteretEtudiantHistorySpecification(InteretEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
