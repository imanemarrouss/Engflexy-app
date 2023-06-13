package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Reponse;
import ma.zsmart.engflexy.dao.criteria.core.ReponseCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class ReponseSpecification extends  AbstractSpecification<ReponseCriteria, Reponse>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("lib", criteria.getLib(),criteria.getLibLike());
        addPredicateLong("numero", criteria.getNumero(), criteria.getNumeroMin(), criteria.getNumeroMax());
        addPredicateFk("etatReponse","id", criteria.getEtatReponse()==null?null:criteria.getEtatReponse().getId());
        addPredicateFk("etatReponse","id", criteria.getEtatReponses());
        addPredicateFk("etatReponse","code", criteria.getEtatReponse()==null?null:criteria.getEtatReponse().getCode());
        addPredicateFk("question","id", criteria.getQuestion()==null?null:criteria.getQuestion().getId());
        addPredicateFk("question","id", criteria.getQuestions());
        addPredicateFk("question","libelle", criteria.getQuestion()==null?null:criteria.getQuestion().getLibelle());
    }

    public ReponseSpecification(ReponseCriteria criteria) {
        super(criteria);
    }

    public ReponseSpecification(ReponseCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
