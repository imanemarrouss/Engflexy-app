package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.CategorieProfHistory;
import ma.zsmart.engflexy.dao.criteria.history.CategorieProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class CategorieProfHistorySpecification extends AbstractHistorySpecification<CategorieProfHistoryCriteria, CategorieProfHistory> {

    public CategorieProfHistorySpecification(CategorieProfHistoryCriteria criteria) {
        super(criteria);
    }

    public CategorieProfHistorySpecification(CategorieProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
