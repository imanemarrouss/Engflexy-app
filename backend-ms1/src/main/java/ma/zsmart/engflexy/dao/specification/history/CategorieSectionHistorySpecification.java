package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.CategorieSectionHistory;
import ma.zsmart.engflexy.dao.criteria.history.CategorieSectionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class CategorieSectionHistorySpecification extends AbstractHistorySpecification<CategorieSectionHistoryCriteria, CategorieSectionHistory> {

    public CategorieSectionHistorySpecification(CategorieSectionHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieSectionHistorySpecification(CategorieSectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
