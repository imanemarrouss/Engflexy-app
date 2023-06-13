package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.HomeWorkQuestion;
import ma.zsmart.engflexy.dao.criteria.core.HomeWorkQuestionCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class HomeWorkQuestionSpecification extends  AbstractSpecification<HomeWorkQuestionCriteria, HomeWorkQuestion>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateInt("numero", criteria.getNumero(), criteria.getNumeroMin(), criteria.getNumeroMax());
        addPredicateBigDecimal("pointReponseJuste", criteria.getPointReponseJuste(), criteria.getPointReponseJusteMin(), criteria.getPointReponseJusteMax());
        addPredicateBigDecimal("pointReponsefausse", criteria.getPointReponsefausse(), criteria.getPointReponsefausseMin(), criteria.getPointReponsefausseMax());
        addPredicateFk("typeDeQuestion","id", criteria.getTypeDeQuestion()==null?null:criteria.getTypeDeQuestion().getId());
        addPredicateFk("typeDeQuestion","id", criteria.getTypeDeQuestions());
        addPredicateFk("typeDeQuestion","ref", criteria.getTypeDeQuestion()==null?null:criteria.getTypeDeQuestion().getRef());
        addPredicateFk("homeWork","id", criteria.getHomeWork()==null?null:criteria.getHomeWork().getId());
        addPredicateFk("homeWork","id", criteria.getHomeWorks());
    }

    public HomeWorkQuestionSpecification(HomeWorkQuestionCriteria criteria) {
        super(criteria);
    }

    public HomeWorkQuestionSpecification(HomeWorkQuestionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
