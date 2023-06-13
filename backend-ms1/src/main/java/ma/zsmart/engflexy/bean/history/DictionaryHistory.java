package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "dictionary")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="dictionary_seq",sequenceName="dictionary_seq",allocationSize=1, initialValue = 1)
public class DictionaryHistory extends HistBusinessObject  {


    public DictionaryHistory() {
    super();
    }

    public DictionaryHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="dictionary_seq")
    public Long getId() {
    return id;
    }
}

