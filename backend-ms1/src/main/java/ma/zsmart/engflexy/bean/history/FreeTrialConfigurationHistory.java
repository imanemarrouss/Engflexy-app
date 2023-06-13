package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "free_trial_configuration")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="free_trial_configuration_seq",sequenceName="free_trial_configuration_seq",allocationSize=1, initialValue = 1)
public class FreeTrialConfigurationHistory extends HistBusinessObject  {


    public FreeTrialConfigurationHistory() {
    super();
    }

    public FreeTrialConfigurationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="free_trial_configuration_seq")
    public Long getId() {
    return id;
    }
}

