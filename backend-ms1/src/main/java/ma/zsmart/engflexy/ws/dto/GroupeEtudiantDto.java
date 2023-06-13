package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupeEtudiantDto  extends AuditBaseDto {

    private String libelle  ;
    private String niveau  ;
    private String dateDebut ;
    private String dateFin ;
    private Long nombrePlace  ;
    private Long nombrePlacevide  ;
    private Long nombrePlaceNonVide  ;

    private GroupeEtudeDto groupeEtude ;
    private ParcoursDto parcours ;
    private ProfDto prof ;

    private List<GroupeEtudiantDetailDto> groupeEtudiantDetails ;


    public GroupeEtudiantDto(){
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
    public String getNiveau(){
        return this.niveau;
    }
    public void setNiveau(String niveau){
        this.niveau = niveau;
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

    @Log
    public Long getNombrePlace(){
        return this.nombrePlace;
    }
    public void setNombrePlace(Long nombrePlace){
        this.nombrePlace = nombrePlace;
    }

    @Log
    public Long getNombrePlacevide(){
        return this.nombrePlacevide;
    }
    public void setNombrePlacevide(Long nombrePlacevide){
        this.nombrePlacevide = nombrePlacevide;
    }

    @Log
    public Long getNombrePlaceNonVide(){
        return this.nombrePlaceNonVide;
    }
    public void setNombrePlaceNonVide(Long nombrePlaceNonVide){
        this.nombrePlaceNonVide = nombrePlaceNonVide;
    }


    public GroupeEtudeDto getGroupeEtude(){
        return this.groupeEtude;
    }

    public void setGroupeEtude(GroupeEtudeDto groupeEtude){
        this.groupeEtude = groupeEtude;
    }
    public ParcoursDto getParcours(){
        return this.parcours;
    }

    public void setParcours(ParcoursDto parcours){
        this.parcours = parcours;
    }
    public ProfDto getProf(){
        return this.prof;
    }

    public void setProf(ProfDto prof){
        this.prof = prof;
    }



    public List<GroupeEtudiantDetailDto> getGroupeEtudiantDetails(){
        return this.groupeEtudiantDetails;
    }

    public void setGroupeEtudiantDetails(List<GroupeEtudiantDetailDto> groupeEtudiantDetails){
        this.groupeEtudiantDetails = groupeEtudiantDetails;
    }

}
