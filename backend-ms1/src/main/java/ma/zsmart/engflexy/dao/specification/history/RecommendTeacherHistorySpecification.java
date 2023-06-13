package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.RecommendTeacherHistory;
import ma.zsmart.engflexy.dao.criteria.history.RecommendTeacherHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class RecommendTeacherHistorySpecification extends AbstractHistorySpecification<RecommendTeacherHistoryCriteria, RecommendTeacherHistory> {

    public RecommendTeacherHistorySpecification(RecommendTeacherHistoryCriteria criteria) {
        super(criteria);
    }

    public RecommendTeacherHistorySpecification(RecommendTeacherHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
