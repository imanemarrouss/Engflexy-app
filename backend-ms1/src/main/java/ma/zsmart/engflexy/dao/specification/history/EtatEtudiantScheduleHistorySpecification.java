package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.EtatEtudiantScheduleHistory;
import ma.zsmart.engflexy.dao.criteria.history.EtatEtudiantScheduleHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class EtatEtudiantScheduleHistorySpecification extends AbstractHistorySpecification<EtatEtudiantScheduleHistoryCriteria, EtatEtudiantScheduleHistory> {

    public EtatEtudiantScheduleHistorySpecification(EtatEtudiantScheduleHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantScheduleHistorySpecification(EtatEtudiantScheduleHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
