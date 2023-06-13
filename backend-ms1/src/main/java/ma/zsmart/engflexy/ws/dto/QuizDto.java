package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuizDto  extends AuditBaseDto {

    private String ref  ;
    private String lib  ;
    private String dateDebut ;
    private String dateFin ;
    private Long numero  ;
    private Long seuilReussite  ;

    private SectionDto section ;

    private List<QuestionDto> questions ;
    private List<QuizEtudiantDto> quizEtudiants ;


    public QuizDto(){
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
    public String getLib(){
        return this.lib;
    }
    public void setLib(String lib){
        this.lib = lib;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateDebut(){
        return this.dateDebut;
    }
    public void setDateDebut(String dateDebut){
        this.dateDebut = dateDebut;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateFin(){
        return this.dateFin;
    }
    public void setDateFin(String dateFin){
        this.dateFin = dateFin;
    }

    @Log
    public Long getNumero(){
        return this.numero;
    }
    public void setNumero(Long numero){
        this.numero = numero;
    }

    @Log
    public Long getSeuilReussite(){
        return this.seuilReussite;
    }
    public void setSeuilReussite(Long seuilReussite){
        this.seuilReussite = seuilReussite;
    }


    public SectionDto getSection(){
        return this.section;
    }

    public void setSection(SectionDto section){
        this.section = section;
    }



    public List<QuestionDto> getQuestions(){
        return this.questions;
    }

    public void setQuestions(List<QuestionDto> questions){
        this.questions = questions;
    }
    public List<QuizEtudiantDto> getQuizEtudiants(){
        return this.quizEtudiants;
    }

    public void setQuizEtudiants(List<QuizEtudiantDto> quizEtudiants){
        this.quizEtudiants = quizEtudiants;
    }

}
