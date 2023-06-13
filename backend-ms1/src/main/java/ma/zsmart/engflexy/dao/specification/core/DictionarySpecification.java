package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Dictionary;
import ma.zsmart.engflexy.dao.criteria.core.DictionaryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class DictionarySpecification extends  AbstractSpecification<DictionaryCriteria, Dictionary>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("word", criteria.getWord(),criteria.getWordLike());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public DictionarySpecification(DictionaryCriteria criteria) {
        super(criteria);
    }

    public DictionarySpecification(DictionaryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
