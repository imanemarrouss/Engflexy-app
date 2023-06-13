package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.AdminHistory;
import ma.zsmart.engflexy.dao.criteria.history.AdminHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class AdminHistorySpecification extends AbstractHistorySpecification<AdminHistoryCriteria, AdminHistory> {

    public AdminHistorySpecification(AdminHistoryCriteria criteria) {
        super(criteria);
    }

    public AdminHistorySpecification(AdminHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
