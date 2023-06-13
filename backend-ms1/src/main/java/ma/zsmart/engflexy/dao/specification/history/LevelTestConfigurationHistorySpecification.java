package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.LevelTestConfigurationHistory;
import ma.zsmart.engflexy.dao.criteria.history.LevelTestConfigurationHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class LevelTestConfigurationHistorySpecification extends AbstractHistorySpecification<LevelTestConfigurationHistoryCriteria, LevelTestConfigurationHistory> {

    public LevelTestConfigurationHistorySpecification(LevelTestConfigurationHistoryCriteria criteria) {
        super(criteria);
    }

    public LevelTestConfigurationHistorySpecification(LevelTestConfigurationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
