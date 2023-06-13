package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "etudiant_class_room")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="etudiant_class_room_seq",sequenceName="etudiant_class_room_seq",allocationSize=1, initialValue = 1)
public class EtudiantClassRoomHistory extends HistBusinessObject  {


    public EtudiantClassRoomHistory() {
    super();
    }

    public EtudiantClassRoomHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etudiant_class_room_seq")
    public Long getId() {
    return id;
    }
}

