package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.InviteStudent;
import ma.zsmart.engflexy.dao.criteria.core.InviteStudentCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class InviteStudentSpecification extends  AbstractSpecification<InviteStudentCriteria, InviteStudent>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateBool("isAccepted", criteria.getIsAccepted());
        addPredicateBool("isPaidPack", criteria.getIsPaidPack());
        addPredicate("emailInvited", criteria.getEmailInvited(),criteria.getEmailInvitedLike());
        addPredicate("dateSentInvitation", criteria.getDateSentInvitation(), criteria.getDateSentInvitationFrom(), criteria.getDateSentInvitationTo());
        addPredicate("dateAcceptInvitation", criteria.getDateAcceptInvitation(), criteria.getDateAcceptInvitationFrom(), criteria.getDateAcceptInvitationTo());
        addPredicate("datePayPack", criteria.getDatePayPack(), criteria.getDatePayPackFrom(), criteria.getDatePayPackTo());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
    }

    public InviteStudentSpecification(InviteStudentCriteria criteria) {
        super(criteria);
    }

    public InviteStudentSpecification(InviteStudentCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
