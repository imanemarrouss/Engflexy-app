package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.SectionHistory;
import ma.zsmart.engflexy.dao.criteria.history.SectionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class SectionHistorySpecification extends AbstractHistorySpecification<SectionHistoryCriteria, SectionHistory> {

    public SectionHistorySpecification(SectionHistoryCriteria criteria) {
        super(criteria);
    }

    public SectionHistorySpecification(SectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
