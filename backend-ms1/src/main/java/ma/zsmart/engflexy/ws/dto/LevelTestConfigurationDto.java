package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class LevelTestConfigurationDto  extends AuditBaseDto {

    private BigDecimal noteMin  ;
    private BigDecimal noteMax  ;

    private ParcoursDto parcours ;



    public LevelTestConfigurationDto(){
        super();
    }



    @Log
    public BigDecimal getNoteMin(){
        return this.noteMin;
    }
    public void setNoteMin(BigDecimal noteMin){
        this.noteMin = noteMin;
    }

    @Log
    public BigDecimal getNoteMax(){
        return this.noteMax;
    }
    public void setNoteMax(BigDecimal noteMax){
        this.noteMax = noteMax;
    }


    public ParcoursDto getParcours(){
        return this.parcours;
    }

    public void setParcours(ParcoursDto parcours){
        this.parcours = parcours;
    }




}
