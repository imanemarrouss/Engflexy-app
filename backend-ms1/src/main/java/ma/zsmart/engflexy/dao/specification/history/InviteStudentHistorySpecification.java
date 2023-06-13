package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.InviteStudentHistory;
import ma.zsmart.engflexy.dao.criteria.history.InviteStudentHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class InviteStudentHistorySpecification extends AbstractHistorySpecification<InviteStudentHistoryCriteria, InviteStudentHistory> {

    public InviteStudentHistorySpecification(InviteStudentHistoryCriteria criteria) {
        super(criteria);
    }

    public InviteStudentHistorySpecification(InviteStudentHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
