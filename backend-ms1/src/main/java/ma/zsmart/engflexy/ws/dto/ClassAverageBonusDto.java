package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClassAverageBonusDto  extends AuditBaseDto {

    private String code  ;
    private Integer nombreSession  = 0 ;
    private BigDecimal prix  ;




    public ClassAverageBonusDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public Integer getNombreSession(){
        return this.nombreSession;
    }
    public void setNombreSession(Integer nombreSession){
        this.nombreSession = nombreSession;
    }

    @Log
    public BigDecimal getPrix(){
        return this.prix;
    }
    public void setPrix(BigDecimal prix){
        this.prix = prix;
    }






}
