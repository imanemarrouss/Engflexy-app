package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.SectionItemHistory;
import ma.zsmart.engflexy.dao.criteria.history.SectionItemHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class SectionItemHistorySpecification extends AbstractHistorySpecification<SectionItemHistoryCriteria, SectionItemHistory> {

    public SectionItemHistorySpecification(SectionItemHistoryCriteria criteria) {
        super(criteria);
    }

    public SectionItemHistorySpecification(SectionItemHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
