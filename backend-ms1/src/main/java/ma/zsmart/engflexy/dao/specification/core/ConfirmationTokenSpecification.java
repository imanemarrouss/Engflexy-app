package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.ConfirmationToken;
import ma.zsmart.engflexy.dao.criteria.core.ConfirmationTokenCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class ConfirmationTokenSpecification extends  AbstractSpecification<ConfirmationTokenCriteria, ConfirmationToken>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("token", criteria.getToken(),criteria.getTokenLike());
        addPredicate("expiresAt", criteria.getExpiresAt(), criteria.getExpiresAtFrom(), criteria.getExpiresAtTo());
        addPredicate("createdAt", criteria.getCreatedAt(), criteria.getCreatedAtFrom(), criteria.getCreatedAtTo());
        addPredicate("confirmedAt", criteria.getConfirmedAt(), criteria.getConfirmedAtFrom(), criteria.getConfirmedAtTo());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public ConfirmationTokenSpecification(ConfirmationTokenCriteria criteria) {
        super(criteria);
    }

    public ConfirmationTokenSpecification(ConfirmationTokenCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
