package ma.zsmart.engflexy.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zsmart.engflexy.zynerator.history.HistBusinessObject;

import javax.persistence.*;


@Entity
@Table(name = "news")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="news_seq",sequenceName="news_seq",allocationSize=1, initialValue = 1)
public class NewsHistory extends HistBusinessObject  {


    public NewsHistory() {
    super();
    }

    public NewsHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="news_seq")
    public Long getId() {
    return id;
    }
}

