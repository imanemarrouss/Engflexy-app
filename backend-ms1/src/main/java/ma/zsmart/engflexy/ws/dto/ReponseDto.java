package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReponseDto  extends AuditBaseDto {

    private String ref  ;
    private String lib  ;
    private Long numero  ;

    private EtatReponseDto etatReponse ;
    private QuestionDto question ;



    public ReponseDto(){
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
    public Long getNumero(){
        return this.numero;
    }
    public void setNumero(Long numero){
        this.numero = numero;
    }


    public EtatReponseDto getEtatReponse(){
        return this.etatReponse;
    }

    public void setEtatReponse(EtatReponseDto etatReponse){
        this.etatReponse = etatReponse;
    }
    public QuestionDto getQuestion(){
        return this.question;
    }

    public void setQuestion(QuestionDto question){
        this.question = question;
    }




}
