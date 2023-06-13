package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtudiantReviewDto  extends AuditBaseDto {

    private Integer review  = 0 ;
    private String comment  ;
    private String dateReview ;

    private EtudiantDto etudiant ;
    private ProfDto prof ;
    private CoursDto cours ;



    public EtudiantReviewDto(){
        super();
    }



    @Log
    public Integer getReview(){
        return this.review;
    }
    public void setReview(Integer review){
        this.review = review;
    }

    @Log
    public String getComment(){
        return this.comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateReview(){
        return this.dateReview;
    }
    public void setDateReview(String dateReview){
        this.dateReview = dateReview;
    }


    public EtudiantDto getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantDto etudiant){
        this.etudiant = etudiant;
    }
    public ProfDto getProf(){
        return this.prof;
    }

    public void setProf(ProfDto prof){
        this.prof = prof;
    }
    public CoursDto getCours(){
        return this.cours;
    }

    public void setCours(CoursDto cours){
        this.cours = cours;
    }




}
