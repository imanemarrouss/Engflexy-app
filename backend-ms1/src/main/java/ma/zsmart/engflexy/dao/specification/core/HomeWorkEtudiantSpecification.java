package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.HomeWorkEtudiant;
import ma.zsmart.engflexy.dao.criteria.core.HomeWorkEtudiantCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class HomeWorkEtudiantSpecification extends  AbstractSpecification<HomeWorkEtudiantCriteria, HomeWorkEtudiant>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("note", criteria.getNote(), criteria.getNoteMin(), criteria.getNoteMax());
        addPredicate("dateHomeWork", criteria.getDateHomeWork(), criteria.getDateHomeWorkFrom(), criteria.getDateHomeWorkTo());
        addPredicateFk("etudiant","id", criteria.getEtudiant()==null?null:criteria.getEtudiant().getId());
        addPredicateFk("etudiant","id", criteria.getEtudiants());
        addPredicateFk("etudiant","ref", criteria.getEtudiant()==null?null:criteria.getEtudiant().getRef());
        addPredicateFk("homeWork","id", criteria.getHomeWork()==null?null:criteria.getHomeWork().getId());
        addPredicateFk("homeWork","id", criteria.getHomeWorks());
        addPredicateFk("resultatHomeWork","id", criteria.getResultatHomeWork()==null?null:criteria.getResultatHomeWork().getId());
        addPredicateFk("resultatHomeWork","id", criteria.getResultatHomeWorks());
        addPredicateFk("resultatHomeWork","code", criteria.getResultatHomeWork()==null?null:criteria.getResultatHomeWork().getCode());
    }

    public HomeWorkEtudiantSpecification(HomeWorkEtudiantCriteria criteria) {
        super(criteria);
    }

    public HomeWorkEtudiantSpecification(HomeWorkEtudiantCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
