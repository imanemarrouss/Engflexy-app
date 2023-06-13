package ma.zsmart.engflexy.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;




@Entity
@Table(name = "prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="prof_seq",sequenceName="prof_seq",allocationSize=1, initialValue = 1)
public class Prof   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String about;
    @Column(length = 500)
    private String email;

    private Parcours parcours ;
    
    private CategorieProf categorieProf ;
    
    private TypeTeacher typeTeacher ;
    

    private List<TrancheHoraireProf> trancheHoraireProfs ;
    private List<ClassRoom> classRooms ;
    private List<RecommendTeacher> recommendTeachers ;

    public Prof(){
        super();
    }

    public Prof(Long id,String ref){
        this.id = id;
        this.ref = ref ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="prof_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getAbout(){
        return this.about;
    }
    public void setAbout(String about){
        this.about = about;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Parcours getParcours(){
        return this.parcours;
    }
    public void setParcours(Parcours parcours){
        this.parcours = parcours;
    }
    @OneToMany(mappedBy = "prof")
    public List<TrancheHoraireProf> getTrancheHoraireProfs(){
        return this.trancheHoraireProfs;
    }
    public void setTrancheHoraireProfs(List<TrancheHoraireProf> trancheHoraireProfs){
        this.trancheHoraireProfs = trancheHoraireProfs;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public CategorieProf getCategorieProf(){
        return this.categorieProf;
    }
    public void setCategorieProf(CategorieProf categorieProf){
        this.categorieProf = categorieProf;
    }
    @OneToMany(mappedBy = "prof")
    public List<ClassRoom> getClassRooms(){
        return this.classRooms;
    }
    public void setClassRooms(List<ClassRoom> classRooms){
        this.classRooms = classRooms;
    }
    @OneToMany(mappedBy = "prof")
    public List<RecommendTeacher> getRecommendTeachers(){
        return this.recommendTeachers;
    }
    public void setRecommendTeachers(List<RecommendTeacher> recommendTeachers){
        this.recommendTeachers = recommendTeachers;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeTeacher getTypeTeacher(){
        return this.typeTeacher;
    }
    public void setTypeTeacher(TypeTeacher typeTeacher){
        this.typeTeacher = typeTeacher;
    }

    @Transient
    public String getLabel() {
        label = ref;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prof prof = (Prof) o;
        return id != null && id.equals(prof.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

