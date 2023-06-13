package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.ProfHistory;
import ma.zsmart.engflexy.dao.criteria.history.ProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class ProfHistorySpecification extends AbstractHistorySpecification<ProfHistoryCriteria, ProfHistory> {

    public ProfHistorySpecification(ProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ProfHistorySpecification(ProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
