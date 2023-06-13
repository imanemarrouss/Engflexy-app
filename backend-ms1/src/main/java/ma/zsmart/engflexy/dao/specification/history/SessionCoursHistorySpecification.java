package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.SessionCoursHistory;
import ma.zsmart.engflexy.dao.criteria.history.SessionCoursHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class SessionCoursHistorySpecification extends AbstractHistorySpecification<SessionCoursHistoryCriteria, SessionCoursHistory> {

    public SessionCoursHistorySpecification(SessionCoursHistoryCriteria criteria) {
        super(criteria);
    }

    public SessionCoursHistorySpecification(SessionCoursHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
