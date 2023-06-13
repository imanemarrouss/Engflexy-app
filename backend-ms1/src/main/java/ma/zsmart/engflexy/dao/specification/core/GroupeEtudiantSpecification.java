package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.GroupeEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.GroupeEtudiantCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class GroupeEtudiantSpecification extends  AbstractSpecification<GroupeEtudiantCriteria, GroupeEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("niveau", criteria.getNiveau(),criteria.getNiveauLike());
        addPredicate("dateDebut", criteria.getDateDebut(), criteria.getDateDebutFrom(), criteria.getDateDebutTo());
        addPredicate("dateFin", criteria.getDateFin(), criteria.getDateFinFrom(), criteria.getDateFinTo());
        addPredicateLong("nombrePlace", criteria.getNombrePlace(), criteria.getNombrePlaceMin(), criteria.getNombrePlaceMax());
        addPredicateLong("nombrePlacevide", criteria.getNombrePlacevide(), criteria.getNombrePlacevideMin(), criteria.getNombrePlacevideMax());
        addPredicateLong("nombrePlaceNonVide", criteria.getNombrePlaceNonVide(), criteria.getNombrePlaceNonVideMin(), criteria.getNombrePlaceNonVideMax());
        addPredicateFk("groupeEtude","id", criteria.getGroupeEtude()==null?null:criteria.getGroupeEtude().getId());
        addPredicateFk("groupeEtude","id", criteria.getGroupeEtudes());
        addPredicateFk("parcours","id", criteria.getParcours()==null?null:criteria.getParcours().getId());
        addPredicateFk("parcours","id", criteria.getParcourss());
        addPredicateFk("parcours","code", criteria.getParcours()==null?null:criteria.getParcours().getCode());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
    }

    public GroupeEtudiantSpecification(GroupeEtudiantCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudiantSpecification(GroupeEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
