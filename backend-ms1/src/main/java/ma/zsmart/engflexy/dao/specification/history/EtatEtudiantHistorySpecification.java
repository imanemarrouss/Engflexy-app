package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.EtatEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.history.EtatEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class EtatEtudiantHistorySpecification extends AbstractHistorySpecification<EtatEtudiantHistoryCriteria, EtatEtudiantHistory> {

    public EtatEtudiantHistorySpecification(EtatEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantHistorySpecification(EtatEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
