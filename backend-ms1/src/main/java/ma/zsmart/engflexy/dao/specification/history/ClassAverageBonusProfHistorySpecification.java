package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.ClassAverageBonusProfHistory;
import ma.zsmart.engflexy.dao.criteria.history.ClassAverageBonusProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class ClassAverageBonusProfHistorySpecification extends AbstractHistorySpecification<ClassAverageBonusProfHistoryCriteria, ClassAverageBonusProfHistory> {

    public ClassAverageBonusProfHistorySpecification(ClassAverageBonusProfHistoryCriteria criteria) {
        super(criteria);
    }

    public ClassAverageBonusProfHistorySpecification(ClassAverageBonusProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
