package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.TeacherLocalityHistory;
import ma.zsmart.engflexy.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class TeacherLocalityHistorySpecification extends AbstractHistorySpecification<TeacherLocalityHistoryCriteria, TeacherLocalityHistory> {

    public TeacherLocalityHistorySpecification(TeacherLocalityHistoryCriteria criteria) {
        super(criteria);
    }

    public TeacherLocalityHistorySpecification(TeacherLocalityHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
