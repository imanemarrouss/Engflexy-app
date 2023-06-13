package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.TrancheHoraireProfHistory;
import ma.zsmart.engflexy.dao.criteria.history.TrancheHoraireProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class TrancheHoraireProfHistorySpecification extends AbstractHistorySpecification<TrancheHoraireProfHistoryCriteria, TrancheHoraireProfHistory> {

    public TrancheHoraireProfHistorySpecification(TrancheHoraireProfHistoryCriteria criteria) {
        super(criteria);
    }

    public TrancheHoraireProfHistorySpecification(TrancheHoraireProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
