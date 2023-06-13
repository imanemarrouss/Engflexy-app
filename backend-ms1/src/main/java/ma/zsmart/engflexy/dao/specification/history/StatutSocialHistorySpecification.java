package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.StatutSocialHistory;
import ma.zsmart.engflexy.dao.criteria.history.StatutSocialHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class StatutSocialHistorySpecification extends AbstractHistorySpecification<StatutSocialHistoryCriteria, StatutSocialHistory> {

    public StatutSocialHistorySpecification(StatutSocialHistoryCriteria criteria) {
        super(criteria);
    }

    public StatutSocialHistorySpecification(StatutSocialHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
