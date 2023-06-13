package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.EtudiantClassRoom;
import ma.zsmart.engflexy.dao.criteria.core.EtudiantClassRoomCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class EtudiantClassRoomSpecification extends  AbstractSpecification<EtudiantClassRoomCriteria, EtudiantClassRoom>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateFk("classRoom","id", criteria.getClassRoom()==null?null:criteria.getClassRoom().getId());
        addPredicateFk("classRoom","id", criteria.getClassRooms());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public EtudiantClassRoomSpecification(EtudiantClassRoomCriteria criteria) {
        super(criteria);
    }

    public EtudiantClassRoomSpecification(EtudiantClassRoomCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
