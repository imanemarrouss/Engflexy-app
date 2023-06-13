package  ma.zsmart.engflexy.dao.specification.history;

import ma.zsmart.engflexy.bean.history.NewsHistory;
import ma.zsmart.engflexy.dao.criteria.history.NewsHistoryCriteria;
import ma.zsmart.engflexy.zynerator.specification.AbstractHistorySpecification;


public class NewsHistorySpecification extends AbstractHistorySpecification<NewsHistoryCriteria, NewsHistory> {

    public NewsHistorySpecification(NewsHistoryCriteria criteria) {
        super(criteria);
    }

    public NewsHistorySpecification(NewsHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
