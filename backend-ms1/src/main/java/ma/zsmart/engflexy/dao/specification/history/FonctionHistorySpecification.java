package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.FonctionHistory;
import ma.zsmart.engflexy.dao.criteria.history.FonctionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class FonctionHistorySpecification extends AbstractHistorySpecification<FonctionHistoryCriteria, FonctionHistory> {

    public FonctionHistorySpecification(FonctionHistoryCriteria criteria) {
        super(criteria);
    }

    public FonctionHistorySpecification(FonctionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
