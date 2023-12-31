package ma.zsmart.engflexy.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;




@Entity
@Table(name = "centre")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="centre_seq",sequenceName="centre_seq",allocationSize=1, initialValue = 1)
public class Centre   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String ref;
    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String description;
    @Column(length = 500)
    private String log;
    @Column(length = 500)
    private String password;


    private List<Parcours> parcourss ;

    public Centre(){
        super();
    }

    public Centre(Long id,String ref){
        this.id = id;
        this.ref = ref ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="centre_seq")
    @Override
    public Long getId(){
        return this.id;
    }
    @Override
    public void setId(Long id){
        this.id = id;
    }
    public String getRef(){
        return this.ref;
    }
    public void setRef(String ref){
        this.ref = ref;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getLog(){
        return this.log;
    }
    public void setLog(String log){
        this.log = log;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    @OneToMany(mappedBy = "centre")
    public List<Parcours> getParcourss(){
        return this.parcourss;
    }
    public void setParcourss(List<Parcours> parcourss){
        this.parcourss = parcourss;
    }
    @Override
    @Transient
    public String getLabel() {
        label = ref;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Centre centre = (Centre) o;
        return id != null && id.equals(centre.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

