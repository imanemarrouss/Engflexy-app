package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.ResultatHomeWork;
import ma.zsmart.engflexy.dao.criteria.core.ResultatHomeWorkCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class ResultatHomeWorkSpecification extends  AbstractSpecification<ResultatHomeWorkCriteria, ResultatHomeWork>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
    }

    public ResultatHomeWorkSpecification(ResultatHomeWorkCriteria criteria) {
        super(criteria);
    }

    public ResultatHomeWorkSpecification(ResultatHomeWorkCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
