package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupeEtudeDto  extends AuditBaseDto {

    private String libelle  ;
    private String description  ;
    private Long nombreEtudiant  ;




    public GroupeEtudeDto(){
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
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    @Log
    public Long getNombreEtudiant(){
        return this.nombreEtudiant;
    }
    public void setNombreEtudiant(Long nombreEtudiant){
        this.nombreEtudiant = nombreEtudiant;
    }






}
