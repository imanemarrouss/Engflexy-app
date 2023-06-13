package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.ConfirmationTokenHistory;
import ma.zsmart.engflexy.dao.criteria.history.ConfirmationTokenHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class ConfirmationTokenHistorySpecification extends AbstractHistorySpecification<ConfirmationTokenHistoryCriteria, ConfirmationTokenHistory> {

    public ConfirmationTokenHistorySpecification(ConfirmationTokenHistoryCriteria criteria) {
        super(criteria);
    }

    public ConfirmationTokenHistorySpecification(ConfirmationTokenHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
