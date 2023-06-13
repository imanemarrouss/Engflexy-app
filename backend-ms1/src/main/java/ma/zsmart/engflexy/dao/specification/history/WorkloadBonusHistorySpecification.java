package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.WorkloadBonusHistory;
import ma.zsmart.engflexy.dao.criteria.history.WorkloadBonusHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class WorkloadBonusHistorySpecification extends AbstractHistorySpecification<WorkloadBonusHistoryCriteria, WorkloadBonusHistory> {

    public WorkloadBonusHistorySpecification(WorkloadBonusHistoryCriteria criteria) {
        super(criteria);
    }

    public WorkloadBonusHistorySpecification(WorkloadBonusHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
