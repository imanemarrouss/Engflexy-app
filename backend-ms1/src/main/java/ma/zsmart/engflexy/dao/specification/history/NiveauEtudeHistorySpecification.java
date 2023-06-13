package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.NiveauEtudeHistory;
import ma.zsmart.engflexy.dao.criteria.history.NiveauEtudeHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class NiveauEtudeHistorySpecification extends AbstractHistorySpecification<NiveauEtudeHistoryCriteria, NiveauEtudeHistory> {

    public NiveauEtudeHistorySpecification(NiveauEtudeHistoryCriteria criteria) {
        super(criteria);
    }

    public NiveauEtudeHistorySpecification(NiveauEtudeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
