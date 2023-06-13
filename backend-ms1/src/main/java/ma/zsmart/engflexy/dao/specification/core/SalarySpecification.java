package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.Salary;
import ma.zsmart.engflexy.dao.criteria.core.SalaryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class SalarySpecification extends  AbstractSpecification<SalaryCriteria, Salary>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateInt("mois", criteria.getMois(), criteria.getMoisMin(), criteria.getMoisMax());
        addPredicateInt("annee", criteria.getAnnee(), criteria.getAnneeMin(), criteria.getAnneeMax());
        addPredicateBigDecimal("nbrSessionMensuel", criteria.getNbrSessionMensuel(), criteria.getNbrSessionMensuelMin(), criteria.getNbrSessionMensuelMax());
        addPredicateBool("payer", criteria.getPayer());
        addPredicateBigDecimal("totalPayment", criteria.getTotalPayment(), criteria.getTotalPaymentMin(), criteria.getTotalPaymentMax());
        addPredicateBigDecimal("totalBonusClassAverage", criteria.getTotalBonusClassAverage(), criteria.getTotalBonusClassAverageMin(), criteria.getTotalBonusClassAverageMax());
        addPredicateBigDecimal("totalBonusWorkload", criteria.getTotalBonusWorkload(), criteria.getTotalBonusWorkloadMin(), criteria.getTotalBonusWorkloadMax());
        addPredicateFk("prof","id", criteria.getProf()==null?null:criteria.getProf().getId());
        addPredicateFk("prof","id", criteria.getProfs());
        addPredicateFk("prof","ref", criteria.getProf()==null?null:criteria.getProf().getRef());
    }

    public SalarySpecification(SalaryCriteria criteria) {
        super(criteria);
    }

    public SalarySpecification(SalaryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
