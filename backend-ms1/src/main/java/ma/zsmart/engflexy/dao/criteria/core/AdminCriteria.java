package  ma.zsmart.engflexy.dao.criteria.core;


import ma.zsmart.engflexy.zynerator.criteria.BaseCriteria;

public class AdminCriteria extends  BaseCriteria  {

    private String description;
    private String descriptionLike;



    public AdminCriteria(){
        // This method is intentionally left empty.

    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }


}
