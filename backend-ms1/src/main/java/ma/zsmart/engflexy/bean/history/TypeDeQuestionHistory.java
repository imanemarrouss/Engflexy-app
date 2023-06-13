package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "type_de_question")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_de_question_seq",sequenceName="type_de_question_seq",allocationSize=1, initialValue = 1)
public class TypeDeQuestionHistory extends HistBusinessObject  {


    public TypeDeQuestionHistory() {
    super();
    }

    public TypeDeQuestionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_de_question_seq")
    public Long getId() {
    return id;
    }
}

