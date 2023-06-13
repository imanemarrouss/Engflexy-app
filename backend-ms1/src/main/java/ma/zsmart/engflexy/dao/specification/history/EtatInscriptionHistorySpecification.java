package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.EtatInscriptionHistory;
import ma.zsmart.engflexy.dao.criteria.history.EtatInscriptionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class EtatInscriptionHistorySpecification extends AbstractHistorySpecification<EtatInscriptionHistoryCriteria, EtatInscriptionHistory> {

    public EtatInscriptionHistorySpecification(EtatInscriptionHistoryCriteria criteria) {
        super(criteria);
    }

    public EtatInscriptionHistorySpecification(EtatInscriptionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
