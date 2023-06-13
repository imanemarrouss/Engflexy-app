package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.HoweWorkQSTReponse;
import ma.zsmart.engflexy.dao.criteria.core.HoweWorkQSTReponseCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class HoweWorkQSTReponseSpecification extends  AbstractSpecification<HoweWorkQSTReponseCriteria, HoweWorkQSTReponse>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("lib", criteria.getLib(),criteria.getLibLike());
        addPredicateInt("numero", criteria.getNumero(), criteria.getNumeroMin(), criteria.getNumeroMax());
        addPredicateFk("etatReponse","id", criteria.getEtatReponse()==null?null:criteria.getEtatReponse().getId());
        addPredicateFk("etatReponse","id", criteria.getEtatReponses());
        addPredicateFk("etatReponse","code", criteria.getEtatReponse()==null?null:criteria.getEtatReponse().getCode());
        addPredicateFk("homeWorkQuestion","id", criteria.getHomeWorkQuestion()==null?null:criteria.getHomeWorkQuestion().getId());
        addPredicateFk("homeWorkQuestion","id", criteria.getHomeWorkQuestions());
        addPredicateFk("homeWorkQuestion","ref", criteria.getHomeWorkQuestion()==null?null:criteria.getHomeWorkQuestion().getRef());
    }

    public HoweWorkQSTReponseSpecification(HoweWorkQSTReponseCriteria criteria) {
        super(criteria);
    }

    public HoweWorkQSTReponseSpecification(HoweWorkQSTReponseCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
