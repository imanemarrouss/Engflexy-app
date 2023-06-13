package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.PaiementHistory;
import ma.zsmart.engflexy.dao.criteria.history.PaiementHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class PaiementHistorySpecification extends AbstractHistorySpecification<PaiementHistoryCriteria, PaiementHistory> {

    public PaiementHistorySpecification(PaiementHistoryCriteria criteria) {
        super(criteria);
    }

    public PaiementHistorySpecification(PaiementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
