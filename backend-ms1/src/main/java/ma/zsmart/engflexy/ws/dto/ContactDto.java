package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ContactDto  extends AuditBaseDto {

    private String name  ;
    private String email  ;
    private String phone  ;
    private String setFrom  ;
    private String dateContact ;
    private Boolean replied  ;
    private String message  ;




    public ContactDto(){
        super();
    }



    @Log
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    @Log
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    @Log
    public String getSetFrom(){
        return this.setFrom;
    }
    public void setSetFrom(String setFrom){
        this.setFrom = setFrom;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateContact(){
        return this.dateContact;
    }
    public void setDateContact(String dateContact){
        this.dateContact = dateContact;
    }

    @Log
    public Boolean getReplied(){
        return this.replied;
    }
    public void setReplied(Boolean replied){
        this.replied = replied;
    }

    @Log
    public String getMessage(){
        return this.message;
    }
    public void setMessage(String message){
        this.message = message;
    }






}
