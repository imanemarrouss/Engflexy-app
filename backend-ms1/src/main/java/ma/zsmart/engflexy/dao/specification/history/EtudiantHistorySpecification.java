package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.EtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.history.EtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class EtudiantHistorySpecification extends AbstractHistorySpecification<EtudiantHistoryCriteria, EtudiantHistory> {

    public EtudiantHistorySpecification(EtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public EtudiantHistorySpecification(EtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
