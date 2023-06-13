package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.GroupeEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.history.GroupeEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class GroupeEtudiantHistorySpecification extends AbstractHistorySpecification<GroupeEtudiantHistoryCriteria, GroupeEtudiantHistory> {

    public GroupeEtudiantHistorySpecification(GroupeEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantHistorySpecification(GroupeEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
