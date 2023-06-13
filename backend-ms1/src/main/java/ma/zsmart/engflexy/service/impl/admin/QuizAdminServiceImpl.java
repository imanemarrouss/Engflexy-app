package ma.zsmart.engflexy.service.impl.admin;

import ma.zsmart.engflexy.bean.core.Question;
import ma.zsmart.engflexy.bean.core.Quiz;
import ma.zsmart.engflexy.bean.core.QuizEtudiant;
import ma.zsmart.engflexy.bean.history.QuizHistory;
import ma.zsmart.engflexy.dao.criteria.core.QuizCriteria;
import ma.zsmart.engflexy.dao.criteria.history.QuizHistoryCriteria;
import ma.zsmart.engflexy.dao.facade.core.QuizDao;
import ma.zsmart.engflexy.dao.facade.history.QuizHistoryDao;
import ma.zsmart.engflexy.dao.specification.core.QuizSpecification;
import ma.zsmart.engflexy.service.facade.admin.QuestionAdminService;
import ma.zsmart.engflexy.service.facade.admin.QuizAdminService;
import ma.zsmart.engflexy.service.facade.admin.QuizEtudiantAdminService;
import ma.zsmart.engflexy.service.facade.admin.SectionAdminService;
import ma.zsmart.engflexy.zynerator.service.AbstractServiceImpl;
import ma.zsmart.engflexy.zynerator.util.ListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class QuizAdminServiceImpl extends AbstractServiceImpl<Quiz,QuizHistory, QuizCriteria, QuizHistoryCriteria, QuizDao,
QuizHistoryDao> implements QuizAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Quiz create(Quiz t) {
        super.create(t);
        if (t.getQuestions() != null) {
                t.getQuestions().forEach(element-> {
                    element.setQuiz(t);
                    questionService.create(element);
            });
        }
        if (t.getQuizEtudiants() != null) {
                t.getQuizEtudiants().forEach(element-> {
                    element.setQuiz(t);
                    quizEtudiantService.create(element);
            });
        }
        return t;
    }

    public Quiz findWithAssociatedLists(Long id){
        Quiz result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setQuestions(questionService.findByQuizId(id));
            result.setQuizEtudiants(quizEtudiantService.findByQuizId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        questionService.deleteByQuizId(id);
        quizEtudiantService.deleteByQuizId(id);
    }


    public void updateWithAssociatedLists(Quiz quiz){
    if(quiz !=null && quiz.getId() != null){
            List<List<Question>> resultQuestions= questionService.getToBeSavedAndToBeDeleted(questionService.findByQuizId(quiz.getId()),quiz.getQuestions());
            questionService.delete(resultQuestions.get(1));
            ListUtil.emptyIfNull(resultQuestions.get(0)).forEach(e -> e.setQuiz(quiz));
            questionService.update(resultQuestions.get(0),true);
            List<List<QuizEtudiant>> resultQuizEtudiants= quizEtudiantService.getToBeSavedAndToBeDeleted(quizEtudiantService.findByQuizId(quiz.getId()),quiz.getQuizEtudiants());
            quizEtudiantService.delete(resultQuizEtudiants.get(1));
            ListUtil.emptyIfNull(resultQuizEtudiants.get(0)).forEach(e -> e.setQuiz(quiz));
            quizEtudiantService.update(resultQuizEtudiants.get(0),true);
    }
    }

    public Quiz findByReferenceEntity(Quiz t){
        return  dao.findByRef(t.getRef());
    }

    public List<Quiz> findBySectionId(Long id){
        return dao.findBySectionId(id);
    }
    public int deleteBySectionId(Long id){
        return dao.deleteBySectionId(id);
    }



    public void configure() {
        super.configure(Quiz.class,QuizHistory.class, QuizHistoryCriteria.class, QuizSpecification.class);
    }

    @Autowired
    private QuestionAdminService questionService ;
    @Autowired
    private QuizEtudiantAdminService quizEtudiantService ;
    @Autowired
    private SectionAdminService sectionService ;

    public QuizAdminServiceImpl(QuizDao dao, QuizHistoryDao historyDao) {
        super(dao, historyDao);
    }

}