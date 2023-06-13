package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.PackStudentHistory;
import ma.zsmart.engflexy.dao.criteria.history.PackStudentHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class PackStudentHistorySpecification extends AbstractHistorySpecification<PackStudentHistoryCriteria, PackStudentHistory> {

    public PackStudentHistorySpecification(PackStudentHistoryCriteria criteria) {
        super(criteria);
    }

    public PackStudentHistorySpecification(PackStudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
