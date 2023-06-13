package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "free_trialformule")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="free_trialformule_seq",sequenceName="free_trialformule_seq",allocationSize=1, initialValue = 1)
public class FreeTrialformuleHistory extends HistBusinessObject  {


    public FreeTrialformuleHistory() {
    super();
    }

    public FreeTrialformuleHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="free_trialformule_seq")
    public Long getId() {
    return id;
    }
}

