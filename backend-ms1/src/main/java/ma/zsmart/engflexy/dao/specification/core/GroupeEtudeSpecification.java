package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.GroupeEtude;
import ma.zsmart.engflexy.dao.criteria.core.GroupeEtudeCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class GroupeEtudeSpecification extends  AbstractSpecification<GroupeEtudeCriteria, GroupeEtude>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateLong("nombreEtudiant", criteria.getNombreEtudiant(), criteria.getNombreEtudiantMin(), criteria.getNombreEtudiantMax());
    }

    public GroupeEtudeSpecification(GroupeEtudeCriteria criteria) {
        super(criteria);
    }

    public GroupeEtudeSpecification(GroupeEtudeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
