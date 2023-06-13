package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;

import java.math.BigDecimal;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuizEtudiantDto  extends AuditBaseDto {

    private String ref  ;
    private BigDecimal note  ;
    private String resultat  ;
    private Long questionCurrent  ;

    private EtudiantDto etudiant ;
    private QuizDto quiz ;

    private List<ReponseEtudiantDto> reponseEtudiants ;


    public QuizEtudiantDto(){
        super();
    }



    @Log
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }

    @Log
    public BigDecimal getNote(){
        return this.note;
    }
    public void setNote(BigDecimal note){
        this.note = note;
    }

    @Log
    public String getResultat(){
        return this.resultat;
    }
    public void setResultat(String resultat){
        this.resultat = resultat;
    }

    @Log
    public Long getQuestionCurrent(){
        return this.questionCurrent;
    }
    public void setQuestionCurrent(Long questionCurrent){
        this.questionCurrent = questionCurrent;
    }


    public EtudiantDto getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantDto etudiant){
        this.etudiant = etudiant;
    }
    public QuizDto getQuiz(){
        return this.quiz;
    }

    public void setQuiz(QuizDto quiz){
        this.quiz = quiz;
    }



    public List<ReponseEtudiantDto> getReponseEtudiants(){
        return this.reponseEtudiants;
    }

    public void setReponseEtudiants(List<ReponseEtudiantDto> reponseEtudiants){
        this.reponseEtudiants = reponseEtudiants;
    }

}
