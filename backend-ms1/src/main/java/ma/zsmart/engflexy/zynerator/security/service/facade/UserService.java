package ma.zsmart.engflexy.zynerator.security.service.facade;

import ma.zsmart.engflexy.zynerator.security.bean.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> findAll();

    User findByUsername(String username);

    User findById(Long id);

    void deleteById(Long id);

    User save(User user);

    User update(User user);

    int delete(Long id);

    User findByUsernameWithRoles(String username);

    int  deleteByUsername(String username);

    public UserDetails loadUserByUsername(String username)  ;

    void updateSuccessfulLogin(String name);

    void updateFailedLogin(String name);

    void loginOrBlock(String username);
}
