package  ma.zsmart.engflexy.dao.criteria.core;


import ma.zsmart.engflexy.zynerator.criteria.BaseCriteria;

import java.util.List;

public class ProfCriteria extends  BaseCriteria  {

    private String ref;
    private String refLike;
    private String about;
    private String aboutLike;
    private String email;
    private String emailLike;

    private ParcoursCriteria parcours ;
    private List<ParcoursCriteria> parcourss ;
    private CategorieProfCriteria categorieProf ;
    private List<CategorieProfCriteria> categorieProfs ;
    private TypeTeacherCriteria typeTeacher ;
    private List<TypeTeacherCriteria> typeTeachers ;


    public ProfCriteria(){}

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

    public String getAbout(){
        return this.about;
    }
    public void setAbout(String about){
        this.about = about;
    }
    public String getAboutLike(){
        return this.aboutLike;
    }
    public void setAboutLike(String aboutLike){
        this.aboutLike = aboutLike;
    }

    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmailLike(){
        return this.emailLike;
    }
    public void setEmailLike(String emailLike){
        this.emailLike = emailLike;
    }


    public ParcoursCriteria getParcours(){
        return this.parcours;
    }

    public void setParcours(ParcoursCriteria parcours){
        this.parcours = parcours;
    }
    public List<ParcoursCriteria> getParcourss(){
        return this.parcourss;
    }

    public void setParcourss(List<ParcoursCriteria> parcourss){
        this.parcourss = parcourss;
    }
    public CategorieProfCriteria getCategorieProf(){
        return this.categorieProf;
    }

    public void setCategorieProf(CategorieProfCriteria categorieProf){
        this.categorieProf = categorieProf;
    }
    public List<CategorieProfCriteria> getCategorieProfs(){
        return this.categorieProfs;
    }

    public void setCategorieProfs(List<CategorieProfCriteria> categorieProfs){
        this.categorieProfs = categorieProfs;
    }
    public TypeTeacherCriteria getTypeTeacher(){
        return this.typeTeacher;
    }

    public void setTypeTeacher(TypeTeacherCriteria typeTeacher){
        this.typeTeacher = typeTeacher;
    }
    public List<TypeTeacherCriteria> getTypeTeachers(){
        return this.typeTeachers;
    }

    public void setTypeTeachers(List<TypeTeacherCriteria> typeTeachers){
        this.typeTeachers = typeTeachers;
    }
}
