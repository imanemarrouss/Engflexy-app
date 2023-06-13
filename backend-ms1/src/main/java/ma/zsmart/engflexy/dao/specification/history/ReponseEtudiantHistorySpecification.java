package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.ReponseEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.history.ReponseEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class ReponseEtudiantHistorySpecification extends AbstractHistorySpecification<ReponseEtudiantHistoryCriteria, ReponseEtudiantHistory> {

    public ReponseEtudiantHistorySpecification(ReponseEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseEtudiantHistorySpecification(ReponseEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
