package ma.zsmart.engflexy.bean.core;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.audit.AuditBusinessObject;

import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "admin")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="admin_seq",sequenceName="admin_seq",allocationSize=1, initialValue = 1)
public class Admin   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String description;



    public Admin(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="admin_seq")
    @Override

    public Long getId(){
        return this.id;
    }
    @Override

    public void setId(Long id){
        this.id = id;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return id != null && id.equals(admin.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

