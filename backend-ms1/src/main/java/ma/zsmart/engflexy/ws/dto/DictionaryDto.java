package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class DictionaryDto  extends AuditBaseDto {

    private String word  ;
    private String definition  ;

    private EtudiantDto etudiant ;



    public DictionaryDto(){
        super();
    }



    @Log
    public String getWord(){
        return this.word;
    }
    public void setWord(String word){
        this.word = word;
    }

    @Log
    public String getDefinition(){
        return this.definition;
    }
    public void setDefinition(String definition){
        this.definition = definition;
    }


    public EtudiantDto getEtudiant(){
        return this.etudiant;
    }

    public void setEtudiant(EtudiantDto etudiant){
        this.etudiant = etudiant;
    }




}
