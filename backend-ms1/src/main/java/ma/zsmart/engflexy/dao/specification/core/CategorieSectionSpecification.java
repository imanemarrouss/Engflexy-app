package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.CategorieSection;
import ma.zsmart.engflexy.dao.criteria.core.CategorieSectionCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class CategorieSectionSpecification extends  AbstractSpecification<CategorieSectionCriteria, CategorieSection>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateInt("numeroOrder", criteria.getNumeroOrder(), criteria.getNumeroOrderMin(), criteria.getNumeroOrderMax());
        addPredicateFk("superCategorieSection","id", criteria.getSuperCategorieSection()==null?null:criteria.getSuperCategorieSection().getId());
        addPredicateFk("superCategorieSection","id", criteria.getSuperCategorieSections());
        addPredicateFk("superCategorieSection","code", criteria.getSuperCategorieSection()==null?null:criteria.getSuperCategorieSection().getCode());
    }

    public CategorieSectionSpecification(CategorieSectionCriteria criteria) {
        super(criteria);
    }

    public CategorieSectionSpecification(CategorieSectionCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
