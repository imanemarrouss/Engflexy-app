package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.ReclamationProf;
import ma.zsmart.engflexy.dao.criteria.core.ReclamationProfCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class ReclamationProfSpecification extends  AbstractSpecification<ReclamationProfCriteria, ReclamationProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("dateReclamation", criteria.getDateReclamation(), criteria.getDateReclamationFrom(), criteria.getDateReclamationTo());
        addPredicateBool("traite", criteria.getTraite());
        addPredicate("dateTraitement", criteria.getDateTraitement(), criteria.getDateTraitementFrom(), criteria.getDateTraitementTo());
        addPredicate("dateReponse", criteria.getDateReponse(), criteria.getDateReponseFrom(), criteria.getDateReponseTo());
        addPredicateBool("postView", criteria.getPostView());
        addPredicate("objetReclamationProf", criteria.getObjetReclamationProf(),criteria.getObjetReclamationProfLike());
        addPredicateFk("admin","id", criteria.getAdmin()==null?null:criteria.getAdmin().getId());
        addPredicateFk("admin","id", criteria.getAdmins());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
        addPredicateFk("typeReclamationProf","id", criteria.getTypeReclamationProf()==null?null:criteria.getTypeReclamationProf().getId());
        addPredicateFk("typeReclamationProf","id", criteria.getTypeReclamationProfs());
        addPredicateFk("typeReclamationProf","code", criteria.getTypeReclamationProf()==null?null:criteria.getTypeReclamationProf().getCode());
    }

    public ReclamationProfSpecification(ReclamationProfCriteria criteria) {
        super(criteria);
    }

    public ReclamationProfSpecification(ReclamationProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
