package ma.zsmart.engflexy.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;




@Entity
@Table(name = "paiement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="paiement_seq",sequenceName="paiement_seq",allocationSize=1, initialValue = 1)
public class Paiement   extends AuditBusinessObject     {

    private Long id;

    private LocalDateTime datePaiement ;

    private Prof prof ;
    
    private GroupeEtudiant groupeEtudiant ;
    


    public Paiement(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="paiement_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Prof getProf(){
        return this.prof;
    }
    public void setProf(Prof prof){
        this.prof = prof;
    }
    public LocalDateTime getDatePaiement(){
        return this.datePaiement;
    }
    public void setDatePaiement(LocalDateTime datePaiement){
        this.datePaiement = datePaiement;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public GroupeEtudiant getGroupeEtudiant(){
        return this.groupeEtudiant;
    }
    public void setGroupeEtudiant(GroupeEtudiant groupeEtudiant){
        this.groupeEtudiant = groupeEtudiant;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paiement paiement = (Paiement) o;
        return id != null && id.equals(paiement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

