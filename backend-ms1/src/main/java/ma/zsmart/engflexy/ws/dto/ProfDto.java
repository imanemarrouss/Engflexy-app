package  ma.zsmart.engflexy.ws.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.Log;
import ma.zsmart.engflexy.zynerator.dto.AuditBaseDto;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProfDto  extends AuditBaseDto {

    private String ref  ;
    private String about  ;
    private String email  ;

    private ParcoursDto parcours ;
    private CategorieProfDto categorieProf ;
    private TypeTeacherDto typeTeacher ;

    private List<TrancheHoraireProfDto> trancheHoraireProfs ;
    private List<ClassRoomDto> classRooms ;
    private List<RecommendTeacherDto> recommendTeachers ;


    public ProfDto(){
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
    public String getAbout(){
        return this.about;
    }
    public void setAbout(String about){
        this.about = about;
    }

    @Log
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }


    public ParcoursDto getParcours(){
        return this.parcours;
    }

    public void setParcours(ParcoursDto parcours){
        this.parcours = parcours;
    }
    public CategorieProfDto getCategorieProf(){
        return this.categorieProf;
    }

    public void setCategorieProf(CategorieProfDto categorieProf){
        this.categorieProf = categorieProf;
    }
    public TypeTeacherDto getTypeTeacher(){
        return this.typeTeacher;
    }

    public void setTypeTeacher(TypeTeacherDto typeTeacher){
        this.typeTeacher = typeTeacher;
    }



    public List<TrancheHoraireProfDto> getTrancheHoraireProfs(){
        return this.trancheHoraireProfs;
    }

    public void setTrancheHoraireProfs(List<TrancheHoraireProfDto> trancheHoraireProfs){
        this.trancheHoraireProfs = trancheHoraireProfs;
    }
    public List<ClassRoomDto> getClassRooms(){
        return this.classRooms;
    }

    public void setClassRooms(List<ClassRoomDto> classRooms){
        this.classRooms = classRooms;
    }
    public List<RecommendTeacherDto> getRecommendTeachers(){
        return this.recommendTeachers;
    }

    public void setRecommendTeachers(List<RecommendTeacherDto> recommendTeachers){
        this.recommendTeachers = recommendTeachers;
    }

}
