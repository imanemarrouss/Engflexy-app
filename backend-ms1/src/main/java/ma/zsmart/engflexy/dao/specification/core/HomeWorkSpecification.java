package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.HomeWork;
import ma.zsmart.engflexy.dao.criteria.core.HomeWorkCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class HomeWorkSpecification extends  AbstractSpecification<HomeWorkCriteria, HomeWork>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("urlImage", criteria.getUrlImage(),criteria.getUrlImageLike());
        addPredicate("urlVideo", criteria.getUrlVideo(),criteria.getUrlVideoLike());
        addPredicateFk("cours","id", criteria.getCours()==null?null:criteria.getCours().getId());
        addPredicateFk("cours","id", criteria.getCourss());
        addPredicateFk("cours","code", criteria.getCours()==null?null:criteria.getCours().getCode());
        addPredicateFk("typeHomeWork","id", criteria.getTypeHomeWork()==null?null:criteria.getTypeHomeWork().getId());
        addPredicateFk("typeHomeWork","id", criteria.getTypeHomeWorks());
        addPredicateFk("typeHomeWork","code", criteria.getTypeHomeWork()==null?null:criteria.getTypeHomeWork().getCode());
    }

    public HomeWorkSpecification(HomeWorkCriteria criteria) {
        super(criteria);
    }

    public HomeWorkSpecification(HomeWorkCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
