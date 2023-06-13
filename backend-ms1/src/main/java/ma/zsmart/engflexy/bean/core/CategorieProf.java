package ma.zsmart.engflexy.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "categorie_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="categorie_prof_seq",sequenceName="categorie_prof_seq",allocationSize=1, initialValue = 1)
public class CategorieProf   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String level;
    private BigDecimal lessonRate = BigDecimal.ZERO;


    private List<Prof> profs ;

    public CategorieProf(){
        super();
    }

    public CategorieProf(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="categorie_prof_seq")
    @Override
    public Long getId(){
        return this.id;
    }
    @Override
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLevel(){
        return this.level;
    }
    public void setLevel(String level){
        this.level = level;
    }
    public BigDecimal getLessonRate(){
        return this.lessonRate;
    }
    public void setLessonRate(BigDecimal lessonRate){
        this.lessonRate = lessonRate;
    }
    @OneToMany(mappedBy = "categorieProf")
    public List<Prof> getProfs(){
        return this.profs;
    }
    public void setProfs(List<Prof> profs){
        this.profs = profs;
    }

    @Override
    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategorieProf categorieProf = (CategorieProf) o;
        return id != null && id.equals(categorieProf.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

