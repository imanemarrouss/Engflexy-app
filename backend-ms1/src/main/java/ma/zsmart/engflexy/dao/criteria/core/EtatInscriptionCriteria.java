package  ma.zsmart.engflexy.dao.criteria.core;


import ma.zsmart.engflexy.zynerator.criteria.BaseCriteria;

public class EtatInscriptionCriteria extends  BaseCriteria  {

    private String ref;
    private String refLike;
    private String libelle;
    private String libelleLike;



    public EtatInscriptionCriteria(){}

    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getRefLike(){
        return this.refLike;
    }
    public void setRefLike(String refLike){
        this.refLike = refLike;
    }

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }


}
