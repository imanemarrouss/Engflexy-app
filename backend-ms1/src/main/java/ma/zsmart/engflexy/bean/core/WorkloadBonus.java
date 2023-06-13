package ma.zsmart.engflexy.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;


@Entity
@Table(name = "workload_bonus")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="workload_bonus_seq",sequenceName="workload_bonus_seq",allocationSize=1, initialValue = 1)
public class WorkloadBonus   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    private Integer nombreSession = 0;
    private BigDecimal prix = BigDecimal.ZERO;



    public WorkloadBonus(){
        super();
    }

    public WorkloadBonus(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="workload_bonus_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public Integer getNombreSession(){
        return this.nombreSession;
    }
    public void setNombreSession(Integer nombreSession){
        this.nombreSession = nombreSession;
    }
    public BigDecimal getPrix(){
        return this.prix;
    }
    public void setPrix(BigDecimal prix){
        this.prix = prix;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkloadBonus workloadBonus = (WorkloadBonus) o;
        return id != null && id.equals(workloadBonus.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

