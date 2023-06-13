package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.TypeReclamationEtudiantHistory;
import ma.zsmart.engflexy.dao.criteria.history.TypeReclamationEtudiantHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class TypeReclamationEtudiantHistorySpecification extends AbstractHistorySpecification<TypeReclamationEtudiantHistoryCriteria, TypeReclamationEtudiantHistory> {

    public TypeReclamationEtudiantHistorySpecification(TypeReclamationEtudiantHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeReclamationEtudiantHistorySpecification(TypeReclamationEtudiantHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
