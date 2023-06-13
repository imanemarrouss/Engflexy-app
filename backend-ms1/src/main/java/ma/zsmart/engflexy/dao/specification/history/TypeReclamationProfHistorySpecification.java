package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.TypeReclamationProfHistory;
import ma.zsmart.engflexy.dao.criteria.history.TypeReclamationProfHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class TypeReclamationProfHistorySpecification extends AbstractHistorySpecification<TypeReclamationProfHistoryCriteria, TypeReclamationProfHistory> {

    public TypeReclamationProfHistorySpecification(TypeReclamationProfHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationProfHistorySpecification(TypeReclamationProfHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
