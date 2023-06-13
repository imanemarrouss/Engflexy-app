package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.CalendrierProfHistory;
import ma.zsmart.engflexy.dao.criteria.history.CalendrierProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class CalendrierProfHistorySpecification extends AbstractHistorySpecification<CalendrierProfHistoryCriteria, CalendrierProfHistory> {

    public CalendrierProfHistorySpecification(CalendrierProfHistoryCriteria criteria) {
        super(criteria);
    }

    public CalendrierProfHistorySpecification(CalendrierProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
