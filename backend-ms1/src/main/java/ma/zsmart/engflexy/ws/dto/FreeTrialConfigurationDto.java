package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class FreeTrialConfigurationDto  extends AuditBaseDto {

    private String dateApplicationDebut ;
    private String dateApplicationFin ;
    private Integer nombreStudentMax  = 0 ;
    private Integer nombreStudentMin  = 0 ;




    public FreeTrialConfigurationDto(){
        super();
    }



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateApplicationDebut(){
        return this.dateApplicationDebut;
    }
    public void setDateApplicationDebut(String dateApplicationDebut){
        this.dateApplicationDebut = dateApplicationDebut;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateApplicationFin(){
        return this.dateApplicationFin;
    }
    public void setDateApplicationFin(String dateApplicationFin){
        this.dateApplicationFin = dateApplicationFin;
    }

    @Log
    public Integer getNombreStudentMax(){
        return this.nombreStudentMax;
    }
    public void setNombreStudentMax(Integer nombreStudentMax){
        this.nombreStudentMax = nombreStudentMax;
    }

    @Log
    public Integer getNombreStudentMin(){
        return this.nombreStudentMin;
    }
    public void setNombreStudentMin(Integer nombreStudentMin){
        this.nombreStudentMin = nombreStudentMin;
    }






}
