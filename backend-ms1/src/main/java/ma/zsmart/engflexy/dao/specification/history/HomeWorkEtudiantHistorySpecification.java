package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.HomeWorkEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.history.HomeWorkEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class HomeWorkEtudiantHistorySpecification extends AbstractHistorySpecification<HomeWorkEtudiantHistoryCriteria, HomeWorkEtudiantHistory> {

    public HomeWorkEtudiantHistorySpecification(HomeWorkEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public HomeWorkEtudiantHistorySpecification(HomeWorkEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
