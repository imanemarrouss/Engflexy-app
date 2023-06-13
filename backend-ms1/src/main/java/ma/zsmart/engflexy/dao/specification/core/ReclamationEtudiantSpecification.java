package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.ReclamationEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.ReclamationEtudiantCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class ReclamationEtudiantSpecification extends  AbstractSpecification<ReclamationEtudiantCriteria, ReclamationEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("dateReclamation", criteria.getDateReclamation(), criteria.getDateReclamationFrom(), criteria.getDateReclamationTo());
        addPredicate("setFrom", criteria.getSetFrom(),criteria.getSetFromLike());
        addPredicate("img", criteria.getImg(),criteria.getImgLike());
        addPredicateBool("traite", criteria.getTraite());
        addPredicate("dateTraitement", criteria.getDateTraitement(), criteria.getDateTraitementFrom(), criteria.getDateTraitementTo());
        addPredicate("dateReponse", criteria.getDateReponse(), criteria.getDateReponseFrom(), criteria.getDateReponseTo());
        addPredicateBool("postView", criteria.getPostView());
        addPredicate("objetReclamationEtudiant", criteria.getObjetReclamationEtudiant(),criteria.getObjetReclamationEtudiantLike());
        addPredicate("username", criteria.getUsername(),criteria.getUsernameLike());
        addPredicateFk("typeReclamationEtudiant","id", criteria.getTypeReclamationEtudiant()==null?null:criteria.getTypeReclamationEtudiant().getId());
        addPredicateFk("typeReclamationEtudiant","id", criteria.getTypeReclamationEtudiants());
        addPredicateFk("typeReclamationEtudiant","code", criteria.getTypeReclamationEtudiant()==null?null:criteria.getTypeReclamationEtudiant().getCode());
    }

    public ReclamationEtudiantSpecification(ReclamationEtudiantCriteria criteria) {
        super(criteria);
    }

    public ReclamationEtudiantSpecification(ReclamationEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
