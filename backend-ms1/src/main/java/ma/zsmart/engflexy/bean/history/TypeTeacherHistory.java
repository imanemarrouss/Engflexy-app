package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "type_teacher")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_teacher_seq",sequenceName="type_teacher_seq",allocationSize=1, initialValue = 1)
public class TypeTeacherHistory extends HistBusinessObject  {


    public TypeTeacherHistory() {
    super();
    }

    public TypeTeacherHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_teacher_seq")
    public Long getId() {
    return id;
    }
}

