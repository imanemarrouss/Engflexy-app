package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.EtatEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.EtatEtudiantCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class EtatEtudiantSpecification extends  AbstractSpecification<EtatEtudiantCriteria, EtatEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("reference", criteria.getReference(),criteria.getReferenceLike());
        addPredicate("username", criteria.getUsername(),criteria.getUsernameLike());
        addPredicate("firstName", criteria.getFirstName(),criteria.getFirstNameLike());
        addPredicate("lastName", criteria.getLastName(),criteria.getLastNameLike());
        addPredicate("nationnalite", criteria.getNationnalite(),criteria.getNationnaliteLike());
        addPredicate("schedule1", criteria.getSchedule1(),criteria.getSchedule1Like());
        addPredicate("schedule2", criteria.getSchedule2(),criteria.getSchedule2Like());
        addPredicate("lastClass", criteria.getLastClass(),criteria.getLastClassLike());
        addPredicate("nbrClass", criteria.getNbrClass(),criteria.getNbrClassLike());
        addPredicate("etat", criteria.getEtat(),criteria.getEtatLike());
        addPredicateLong("etatNumber", criteria.getEtatNumber(), criteria.getEtatNumberMin(), criteria.getEtatNumberMax());
    }

    public EtatEtudiantSpecification(EtatEtudiantCriteria criteria) {
        super(criteria);
    }

    public EtatEtudiantSpecification(EtatEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
