package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.SuperCategorieSectionHistory;
import ma.zsmart.engflexy.dao.criteria.history.SuperCategorieSectionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class SuperCategorieSectionHistorySpecification extends AbstractHistorySpecification<SuperCategorieSectionHistoryCriteria, SuperCategorieSectionHistory> {

    public SuperCategorieSectionHistorySpecification(SuperCategorieSectionHistoryCriteria criteria) {
        super(criteria);
    }

    public SuperCategorieSectionHistorySpecification(SuperCategorieSectionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
