package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeDeQuestionDto  extends AuditBaseDto {

    private String ref  ;
    private String lib  ;




    public TypeDeQuestionDto(){
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






}
