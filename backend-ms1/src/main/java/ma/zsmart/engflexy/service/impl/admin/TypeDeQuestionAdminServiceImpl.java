package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.TypeDeQuestion;
import ma.zsmart.engflexy.bean.history.TypeDeQuestionHistory;
import ma.zsmart.engflexy.dao.criteria.core.TypeDeQuestionCriteria;
import ma.zsmart.engflexy.dao.criteria.history.TypeDeQuestionHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.TypeDeQuestionDao;
import ma.zsmart.engflexy.dao.facade.history.TypeDeQuestionHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.TypeDeQuestionSpecification;
import ma.zsmart.engflexy.service.facade.admin.TypeDeQuestionAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
@Service
public class TypeDeQuestionAdminServiceImpl extends AbstractServiceImpl<TypeDeQuestion,TypeDeQuestionHistory, TypeDeQuestionCriteria, TypeDeQuestionHistoryCriteria, TypeDeQuestionDao,
TypeDeQuestionHistoryDao> implements TypeDeQuestionAdminService {


    public TypeDeQuestion findByReferenceEntity(TypeDeQuestion t){
        return  dao.findByRef(t.getRef());
    }




    public void configure() {
        super.configure(TypeDeQuestion.class,TypeDeQuestionHistory.class, TypeDeQuestionHistoryCriteria.class, TypeDeQuestionSpecification.class);
    }


    public TypeDeQuestionAdminServiceImpl(TypeDeQuestionDao dao, TypeDeQuestionHistoryDao historyDao) {
        super(dao, historyDao);
    }

}