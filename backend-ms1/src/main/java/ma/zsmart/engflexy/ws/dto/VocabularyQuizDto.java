package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class VocabularyQuizDto  extends AuditBaseDto {

    private String libelle  ;
    private String dateDebut ;
    private String dateFin ;

    private SectionDto section ;

    private List<VocabularyDto> vocabularys ;


    public VocabularyQuizDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
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


    public SectionDto getSection(){
        return this.section;
    }

    public void setSection(SectionDto section){
        this.section = section;
    }



    public List<VocabularyDto> getVocabularys(){
        return this.vocabularys;
    }

    public void setVocabularys(List<VocabularyDto> vocabularys){
        this.vocabularys = vocabularys;
    }

}
