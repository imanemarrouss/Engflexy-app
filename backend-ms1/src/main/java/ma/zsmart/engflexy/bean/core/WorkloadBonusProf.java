package ma.zsmart.engflexy.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "workload_bonus_prof")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="workload_bonus_prof_seq",sequenceName="workload_bonus_prof_seq",allocationSize=1, initialValue = 1)
public class WorkloadBonusProf   extends AuditBusinessObject     {

    private Long id;

    private Integer mois = 0;
    private Integer annee = 0;

    private WorkloadBonus workloadBonus ;
    
    private Prof prof ;
    
    private Salary salary ;
    


    public WorkloadBonusProf(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="workload_bonus_prof_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public WorkloadBonus getWorkloadBonus(){
        return this.workloadBonus;
    }
    public void setWorkloadBonus(WorkloadBonus workloadBonus){
        this.workloadBonus = workloadBonus;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Prof getProf(){
        return this.prof;
    }
    public void setProf(Prof prof){
        this.prof = prof;
    }
    public Integer getMois(){
        return this.mois;
    }
    public void setMois(Integer mois){
        this.mois = mois;
    }
    public Integer getAnnee(){
        return this.annee;
    }
    public void setAnnee(Integer annee){
        this.annee = annee;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Salary getSalary(){
        return this.salary;
    }
    public void setSalary(Salary salary){
        this.salary = salary;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkloadBonusProf workloadBonusProf = (WorkloadBonusProf) o;
        return id != null && id.equals(workloadBonusProf.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

