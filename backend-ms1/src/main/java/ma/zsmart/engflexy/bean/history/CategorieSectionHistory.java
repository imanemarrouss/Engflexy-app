package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "categorie_section")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_section_seq",sequenceName="categorie_section_seq",allocationSize=1, initialValue = 1)
public class CategorieSectionHistory extends HistBusinessObject  {


    public CategorieSectionHistory() {
    super();
    }

    public CategorieSectionHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categorie_section_seq")
    @Override
    public Long getId() {
    return id;
    }
}

