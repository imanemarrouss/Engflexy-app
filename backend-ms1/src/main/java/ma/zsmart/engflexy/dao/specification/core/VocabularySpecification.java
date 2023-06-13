package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Vocabulary;
import ma.zsmart.engflexy.dao.criteria.core.VocabularyCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class VocabularySpecification extends  AbstractSpecification<VocabularyCriteria, Vocabulary>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicateLong("numero", criteria.getNumero(), criteria.getNumeroMin(), criteria.getNumeroMax());
        addPredicate("word", criteria.getWord(),criteria.getWordLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("result", criteria.getResult(),criteria.getResultLike());
        addPredicate("explication", criteria.getExplication(),criteria.getExplicationLike());
        addPredicate("exemple", criteria.getExemple(),criteria.getExempleLike());
        addPredicate("image", criteria.getImage(),criteria.getImageLike());
        addPredicateFk("section","id", criteria.getSection()==null?null:criteria.getSection().getId());
        addPredicateFk("section","id", criteria.getSections());
        addPredicateFk("section","code", criteria.getSection()==null?null:criteria.getSection().getCode());
        addPredicateFk("vocabularyQuiz","id", criteria.getVocabularyQuiz()==null?null:criteria.getVocabularyQuiz().getId());
        addPredicateFk("vocabularyQuiz","id", criteria.getVocabularyQuizs());
    }

    public VocabularySpecification(VocabularyCriteria criteria) {
        super(criteria);
    }

    public VocabularySpecification(VocabularyCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
