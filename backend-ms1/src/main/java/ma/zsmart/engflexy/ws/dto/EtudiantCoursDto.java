package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtudiantCoursDto  extends AuditBaseDto {

    private Boolean payer  ;
    private String dateFin ;

    private EtudiantDto etudiant ;
    private ProfDto prof ;
    private CoursDto cours ;



    public EtudiantCoursDto(){
        super();
    }



    @Log
    public Boolean getPayer(){
        return this.payer;
    }
    public void setPayer(Boolean payer){
        this.payer = payer;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(String dateFin){
        this.dateFin = dateFin;
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
