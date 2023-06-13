package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.WorkloadBonusProfHistory;
import ma.zsmart.engflexy.dao.criteria.history.WorkloadBonusProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class WorkloadBonusProfHistorySpecification extends AbstractHistorySpecification<WorkloadBonusProfHistoryCriteria, WorkloadBonusProfHistory> {

    public WorkloadBonusProfHistorySpecification(WorkloadBonusProfHistoryCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusProfHistorySpecification(WorkloadBonusProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
