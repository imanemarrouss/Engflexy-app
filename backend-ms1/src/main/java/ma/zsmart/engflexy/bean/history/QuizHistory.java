package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "quiz")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="quiz_seq",sequenceName="quiz_seq",allocationSize=1, initialValue = 1)
public class QuizHistory extends HistBusinessObject  {


    public QuizHistory() {
    super();
    }

    public QuizHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="quiz_seq")
    public Long getId() {
    return id;
    }
}

