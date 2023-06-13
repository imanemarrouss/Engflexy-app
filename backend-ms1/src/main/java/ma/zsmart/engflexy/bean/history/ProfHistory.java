package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="prof_seq",sequenceName="prof_seq",allocationSize=1, initialValue = 1)
public class ProfHistory extends HistBusinessObject  {


    public ProfHistory() {
    super();
    }

    public ProfHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="prof_seq")
    public Long getId() {
    return id;
    }
}

