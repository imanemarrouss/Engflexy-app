package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "quiz_etudiant")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="quiz_etudiant_seq",sequenceName="quiz_etudiant_seq",allocationSize=1, initialValue = 1)
public class QuizEtudiantHistory extends HistBusinessObject  {


    public QuizEtudiantHistory() {
    super();
    }

    public QuizEtudiantHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="quiz_etudiant_seq")
    public Long getId() {
    return id;
    }
}

