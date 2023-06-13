package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "etudiant_cours")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etudiant_cours_seq",sequenceName="etudiant_cours_seq",allocationSize=1, initialValue = 1)
public class EtudiantCoursHistory extends HistBusinessObject  {


    public EtudiantCoursHistory() {
    super();
    }

    public EtudiantCoursHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etudiant_cours_seq")
    public Long getId() {
    return id;
    }
}

