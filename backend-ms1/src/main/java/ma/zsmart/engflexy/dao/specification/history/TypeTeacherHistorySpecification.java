package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.TypeTeacherHistory;
import ma.zsmart.engflexy.dao.criteria.history.TypeTeacherHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class TypeTeacherHistorySpecification extends AbstractHistorySpecification<TypeTeacherHistoryCriteria, TypeTeacherHistory> {

    public TypeTeacherHistorySpecification(TypeTeacherHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeTeacherHistorySpecification(TypeTeacherHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
