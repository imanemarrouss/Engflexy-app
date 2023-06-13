package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaiementDto  extends AuditBaseDto {

    private String datePaiement ;

    private ProfDto prof ;
    private GroupeEtudiantDto groupeEtudiant ;



    public PaiementDto(){
        super();
    }



    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatePaiement(){
        return this.datePaiement;
    }
    public void setDatePaiement(String datePaiement){
        this.datePaiement = datePaiement;
    }


    public ProfDto getProf(){
        return this.prof;
    }

    public void setProf(ProfDto prof){
        this.prof = prof;
    }
    public GroupeEtudiantDto getGroupeEtudiant(){
        return this.groupeEtudiant;
    }

    public void setGroupeEtudiant(GroupeEtudiantDto groupeEtudiant){
        this.groupeEtudiant = groupeEtudiant;
    }




}
