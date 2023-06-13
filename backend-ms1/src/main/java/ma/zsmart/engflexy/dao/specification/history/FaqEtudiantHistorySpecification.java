package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FaqEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.history.FaqEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FaqEtudiantHistorySpecification extends AbstractHistorySpecification<FaqEtudiantHistoryCriteria, FaqEtudiantHistory> {

    public FaqEtudiantHistorySpecification(FaqEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public FaqEtudiantHistorySpecification(FaqEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
