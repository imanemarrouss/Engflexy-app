package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "etat_reponse")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etat_reponse_seq",sequenceName="etat_reponse_seq",allocationSize=1, initialValue = 1)
public class EtatReponseHistory extends HistBusinessObject  {


    public EtatReponseHistory() {
    super();
    }

    public EtatReponseHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etat_reponse_seq")
    public Long getId() {
    return id;
    }
}

