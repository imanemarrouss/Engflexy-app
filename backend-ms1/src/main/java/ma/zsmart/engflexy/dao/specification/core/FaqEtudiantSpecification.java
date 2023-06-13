package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.FaqEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.FaqEtudiantCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FaqEtudiantSpecification extends  AbstractSpecification<FaqEtudiantCriteria, FaqEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
        addPredicateFk("admin","id", criteria.getAdmin()==null?null:criteria.getAdmin().getId());
        addPredicateFk("admin","id", criteria.getAdmins());
        addPredicateFk("faqType","id", criteria.getFaqType()==null?null:criteria.getFaqType().getId());
        addPredicateFk("faqType","id", criteria.getFaqTypes());
    }

    public FaqEtudiantSpecification(FaqEtudiantCriteria criteria) {
        super(criteria);
    }

    public FaqEtudiantSpecification(FaqEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
