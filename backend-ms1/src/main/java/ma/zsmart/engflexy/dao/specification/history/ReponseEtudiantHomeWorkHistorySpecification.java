package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.ReponseEtudiantHomeWorkHistory;
import ma.zsmart.engflexy.dao.criteria.history.ReponseEtudiantHomeWorkHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class ReponseEtudiantHomeWorkHistorySpecification extends AbstractHistorySpecification<ReponseEtudiantHomeWorkHistoryCriteria, ReponseEtudiantHomeWorkHistory> {

    public ReponseEtudiantHomeWorkHistorySpecification(ReponseEtudiantHomeWorkHistoryCriteria criteria) {
        super(criteria);
    }

    public ReponseEtudiantHomeWorkHistorySpecification(ReponseEtudiantHomeWorkHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
