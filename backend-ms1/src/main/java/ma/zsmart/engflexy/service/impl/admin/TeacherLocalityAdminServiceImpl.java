package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.TeacherLocality;
import ma.zsmart.engflexy.bean.history.TeacherLocalityHistory;
import ma.zsmart.engflexy.dao.criteria.core.TeacherLocalityCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TeacherLocalityHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.TeacherLocalityDao;
import ma.zsmart.engflexy.dao.facade.history.TeacherLocalityHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.TeacherLocalitySpecification;
import ma.zsmart.engflexy.service.facade.admin.TeacherLocalityAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherLocalityAdminServiceImpl extends AbstractServiceImpl<TeacherLocality,TeacherLocalityHistory, TeacherLocalityCriteria, TeacherLocalityHistoryCriteria, TeacherLocalityDao,
TeacherLocalityHistoryDao> implements TeacherLocalityAdminService {

    public Long getNextOrdre() {
    Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
    return max != null ? max + 1 : 1;
    }

    @Cacheable(cacheNames = "teacherLocalitys")
    public List<TeacherLocality> findAll() {
        return super.findAll();
    }

    @CachePut(cacheNames = "teacherLocalitys", key = "#t.id")
    public TeacherLocality create(TeacherLocality t) {
        return super.create(t);
    }

    @CachePut(cacheNames = "teacherLocalitys", key = "#t.id")
    public TeacherLocality update(TeacherLocality t) {
        return super.update(t);
    }

    @Cacheable(cacheNames = "teacherLocalitys", key = "#id")
    public TeacherLocality findById(Long id) {
        return super.findById(id);
    }

    @CacheEvict(cacheNames = "teacherLocalitys", key = "#id")
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public TeacherLocality findByReferenceEntity(TeacherLocality t){
        return  dao.findByCode(t.getCode());
    }




    public void configure() {
        super.configure(TeacherLocality.class,TeacherLocalityHistory.class, TeacherLocalityHistoryCriteria.class, TeacherLocalitySpecification.class);
    }


    public TeacherLocalityAdminServiceImpl(TeacherLocalityDao dao, TeacherLocalityHistoryDao historyDao) {
        super(dao, historyDao);
    }

}