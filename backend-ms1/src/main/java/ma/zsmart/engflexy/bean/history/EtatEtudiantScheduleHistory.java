package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "etat_etudiant_schedule")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_etudiant_schedule_seq",sequenceName="etat_etudiant_schedule_seq",allocationSize=1, initialValue = 1)
public class EtatEtudiantScheduleHistory extends HistBusinessObject  {


    public EtatEtudiantScheduleHistory() {
    super();
    }

    public EtatEtudiantScheduleHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_etudiant_schedule_seq")
    public Long getId() {
    return id;
    }
}

