package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.TypeDeQuestionHistory;
import ma.zsmart.engflexy.dao.criteria.history.TypeDeQuestionHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class TypeDeQuestionHistorySpecification extends AbstractHistorySpecification<TypeDeQuestionHistoryCriteria, TypeDeQuestionHistory> {

    public TypeDeQuestionHistorySpecification(TypeDeQuestionHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeDeQuestionHistorySpecification(TypeDeQuestionHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
