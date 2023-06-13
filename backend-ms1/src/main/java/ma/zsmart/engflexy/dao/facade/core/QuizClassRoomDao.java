package ma.zsmart.engflexy.dao.facade.core;

import ma.zsmart.engflexy.bean.core.QuizClassRoom;
import ma.zsmart.engflexy.zynerator.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface QuizClassRoomDao extends AbstractRepository<QuizClassRoom,Long>  {

    List<QuizClassRoom> findByClassRoomId(Long id);
    int deleteByClassRoomId(Long id);
    List<QuizClassRoom> findByQuizId(Long id);
    int deleteByQuizId(Long id);

}
