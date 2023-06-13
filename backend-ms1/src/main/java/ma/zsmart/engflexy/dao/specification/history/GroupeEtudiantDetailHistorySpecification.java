package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.GroupeEtudiantDetailHistory;
import ma.zsmart.engflexy.dao.criteria.history.GroupeEtudiantDetailHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class GroupeEtudiantDetailHistorySpecification extends AbstractHistorySpecification<GroupeEtudiantDetailHistoryCriteria, GroupeEtudiantDetailHistory> {

    public GroupeEtudiantDetailHistorySpecification(GroupeEtudiantDetailHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantDetailHistorySpecification(GroupeEtudiantDetailHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
