package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.HoweWorkQSTReponseHistory;
import ma.zsmart.engflexy.dao.criteria.history.HoweWorkQSTReponseHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class HoweWorkQSTReponseHistorySpecification extends AbstractHistorySpecification<HoweWorkQSTReponseHistoryCriteria, HoweWorkQSTReponseHistory> {

    public HoweWorkQSTReponseHistorySpecification(HoweWorkQSTReponseHistoryCriteria criteria) {
        super(criteria);
    }

    public HoweWorkQSTReponseHistorySpecification(HoweWorkQSTReponseHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
