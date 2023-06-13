package  ma.zsmart.engflexy.dao.specification.core;

import ma.zsmart.engflexy.bean.core.News;
import ma.zsmart.engflexy.dao.criteria.core.NewsCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractSpecification;

public class NewsSpecification extends  AbstractSpecification<NewsCriteria, News>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ref", criteria.getRef(),criteria.getRefLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("image", criteria.getImage(),criteria.getImageLike());
        addPredicate("dateNews", criteria.getDateNews(), criteria.getDateNewsFrom(), criteria.getDateNewsTo());
        addPredicate("dateDebut", criteria.getDateDebut(), criteria.getDateDebutFrom(), criteria.getDateDebutTo());
        addPredicate("dateFin", criteria.getDateFin(), criteria.getDateFinFrom(), criteria.getDateFinTo());
        addPredicateInt("numeroOrdre", criteria.getNumeroOrdre(), criteria.getNumeroOrdreMin(), criteria.getNumeroOrdreMax());
        addPredicate("destinataire", criteria.getDestinataire(),criteria.getDestinataireLike());
    }

    public NewsSpecification(NewsCriteria criteria) {
        super(criteria);
    }

    public NewsSpecification(NewsCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
