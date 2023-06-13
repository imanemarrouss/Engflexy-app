package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Skill;
import ma.zsmart.engflexy.dao.criteria.core.SkillCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class SkillSpecification extends  AbstractSpecification<SkillCriteria, Skill>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public SkillSpecification(SkillCriteria criteria) {
        super(criteria);
    }

    public SkillSpecification(SkillCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
