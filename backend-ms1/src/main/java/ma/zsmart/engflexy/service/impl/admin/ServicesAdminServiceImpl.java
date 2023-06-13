package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Services;
import ma.zsmart.engflexy.bean.history.ServicesHistory;
import ma.zsmart.engflexy.dao.criteria.core.ServicesCriteria;
import ma.zsmart.engflexy.dao.criteria.history.ServicesHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.ServicesDao;
import ma.zsmart.engflexy.dao.facade.history.ServicesHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.ServicesSpecification;
import ma.zsmart.engflexy.service.facade.admin.ServicesAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicesAdminServiceImpl extends AbstractServiceImpl<Services,ServicesHistory, ServicesCriteria, ServicesHistoryCriteria, ServicesDao,
ServicesHistoryDao> implements ServicesAdminService {

    public Long getNextOrdre() {
    Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
    return max != null ? max + 1 : 1;
    }

    @Cacheable(cacheNames = "servicess")
    public List<Services> findAll() {
        return super.findAll();
    }

    @CachePut(cacheNames = "servicess", key = "#t.id")
    public Services create(Services t) {
        return super.create(t);
    }

    @CachePut(cacheNames = "servicess", key = "#t.id")
    public Services update(Services t) {
        return super.update(t);
    }

    @Cacheable(cacheNames = "servicess", key = "#id")
    public Services findById(Long id) {
        return super.findById(id);
    }

    @CacheEvict(cacheNames = "servicess", key = "#id")
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public Services findByReferenceEntity(Services t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(Services.class,ServicesHistory.class, ServicesHistoryCriteria.class, ServicesSpecification.class);
    }


    public ServicesAdminServiceImpl(ServicesDao dao, ServicesHistoryDao historyDao) {
        super(dao, historyDao);
    }

}