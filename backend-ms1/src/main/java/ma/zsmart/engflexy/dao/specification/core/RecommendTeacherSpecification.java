package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.RecommendTeacher;
import ma.zsmart.engflexy.dao.criteria.core.RecommendTeacherCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class RecommendTeacherSpecification extends  AbstractSpecification<RecommendTeacherCriteria, RecommendTeacher>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicateInt("nombrevote", criteria.getNombrevote(), criteria.getNombrevoteMin(), criteria.getNombrevoteMax());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
        addPredicate("telephone", criteria.getTelephone(),criteria.getTelephoneLike());
        addPredicate("login", criteria.getLogin(),criteria.getLoginLike());
        addPredicate("dateRecommamdation", criteria.getDateRecommamdation(), criteria.getDateRecommamdationFrom(), criteria.getDateRecommamdationTo());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
    }

    public RecommendTeacherSpecification(RecommendTeacherCriteria criteria) {
        super(criteria);
    }

    public RecommendTeacherSpecification(RecommendTeacherCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
