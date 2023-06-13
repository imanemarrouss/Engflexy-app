package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.FreeTrialDetail;
import ma.zsmart.engflexy.dao.criteria.core.FreeTrialDetailCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class FreeTrialDetailSpecification extends  AbstractSpecification<FreeTrialDetailCriteria, FreeTrialDetail>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBool("presence", criteria.getPresence());
        addPredicateBool("whatsUpMessageSent", criteria.getWhatsUpMessageSent());
        addPredicate("dateEnvoiwhatsUpMessage", criteria.getDateEnvoiwhatsUpMessage(), criteria.getDateEnvoiwhatsUpMessageFrom(), criteria.getDateEnvoiwhatsUpMessageTo());
        addPredicateBool("emailMessageSent", criteria.getEmailMessageSent());
        addPredicate("dateEnvoiEmailMessage", criteria.getDateEnvoiEmailMessage(), criteria.getDateEnvoiEmailMessageFrom(), criteria.getDateEnvoiEmailMessageTo());
        addPredicateBool("abonne", criteria.getAbonne());
        addPredicateFk("freeTrial","id", criteria.getFreeTrial()==null?null:criteria.getFreeTrial().getId());
        addPredicateFk("freeTrial","id", criteria.getFreeTrials());
        addPredicateFk("freeTrial","reference", criteria.getFreeTrial()==null?null:criteria.getFreeTrial().getReference());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public FreeTrialDetailSpecification(FreeTrialDetailCriteria criteria) {
        super(criteria);
    }

    public FreeTrialDetailSpecification(FreeTrialDetailCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
