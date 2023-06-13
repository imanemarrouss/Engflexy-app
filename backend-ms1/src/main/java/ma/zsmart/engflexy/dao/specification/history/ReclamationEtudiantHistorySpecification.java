package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.ReclamationEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.history.ReclamationEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class ReclamationEtudiantHistorySpecification extends AbstractHistorySpecification<ReclamationEtudiantHistoryCriteria, ReclamationEtudiantHistory> {

    public ReclamationEtudiantHistorySpecification(ReclamationEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public ReclamationEtudiantHistorySpecification(ReclamationEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
