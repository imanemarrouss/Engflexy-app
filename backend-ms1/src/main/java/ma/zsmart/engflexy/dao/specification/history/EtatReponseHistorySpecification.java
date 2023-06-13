package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.EtatReponseHistory;
import ma.zsmart.engflexy.dao.criteria.history.EtatReponseHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class EtatReponseHistorySpecification extends AbstractHistorySpecification<EtatReponseHistoryCriteria, EtatReponseHistory> {

    public EtatReponseHistorySpecification(EtatReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatReponseHistorySpecification(EtatReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
