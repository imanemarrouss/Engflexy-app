package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "reclamation_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="reclamation_etudiant_seq",sequenceName="reclamation_etudiant_seq",allocationSize=1, initialValue = 1)
public class ReclamationEtudiantHistory extends HistBusinessObject  {


    public ReclamationEtudiantHistory() {
    super();
    }

    public ReclamationEtudiantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="reclamation_etudiant_seq")
    public Long getId() {
    return id;
    }
}

