package  ma.zsmart.engflexy.dao.criteria.core;


import ma.zsmart.engflexy.zynerator.criteria.BaseCriteriaEnhanced;

public class TeacherLocalityCriteria extends  BaseCriteriaEnhanced  {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;



    public TeacherLocalityCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
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
