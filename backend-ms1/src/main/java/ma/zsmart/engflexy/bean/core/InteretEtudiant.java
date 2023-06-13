package ma.zsmart.engflexy.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "interet_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="interet_etudiant_seq",sequenceName="interet_etudiant_seq",allocationSize=1, initialValue = 1)
public class InteretEtudiant   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;



    public InteretEtudiant(){
        super();
    }

    public InteretEtudiant(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="interet_etudiant_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InteretEtudiant interetEtudiant = (InteretEtudiant) o;
        return id != null && id.equals(interetEtudiant.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

