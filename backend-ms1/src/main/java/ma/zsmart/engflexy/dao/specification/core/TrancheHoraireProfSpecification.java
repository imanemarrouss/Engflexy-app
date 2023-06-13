package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.TrancheHoraireProf;
import ma.zsmart.engflexy.dao.criteria.core.TrancheHoraireProfCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class TrancheHoraireProfSpecification extends  AbstractSpecification<TrancheHoraireProfCriteria, TrancheHoraireProf>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("startHour", criteria.getStartHour(),criteria.getStartHourLike());
        addPredicate("endHour", criteria.getEndHour(),criteria.getEndHourLike());
        addPredicateInt("day", criteria.getDay(), criteria.getDayMin(), criteria.getDayMax());
        addPredicateInt("groupIndex", criteria.getGroupIndex(), criteria.getGroupIndexMin(), criteria.getGroupIndexMax());
        addPredicateLong("profsId", criteria.getProfsId(), criteria.getProfsIdMin(), criteria.getProfsIdMax());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
    }

    public TrancheHoraireProfSpecification(TrancheHoraireProfCriteria criteria) {
        super(criteria);
    }

    public TrancheHoraireProfSpecification(TrancheHoraireProfCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
