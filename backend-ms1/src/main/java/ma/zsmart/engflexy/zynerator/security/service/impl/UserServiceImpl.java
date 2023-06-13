package ma.zsmart.engflexy.zynerator.security.service.impl;

import ma.zsmart.engflexy.zynerator.security.bean.Role;
import ma.zsmart.engflexy.zynerator.security.bean.User;
import ma.zsmart.engflexy.zynerator.security.dao.UserDao;
import ma.zsmart.engflexy.zynerator.security.service.facade.RoleService;
import ma.zsmart.engflexy.zynerator.security.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleService roleService;

    @Autowired @Lazy
    PasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findByUsername(String username) {
        if (username == null)
        return null;
        return userDao.findByUsername(username);
    }

    @Override
    public User findByUsernameWithRoles(String username) {
        if (username == null)
        return null;
        return userDao.findByUsername(username);
    }

    @Override
    @Transactional
    public int deleteByUsername(String username) {
        return userDao.deleteByUsername(username);
    }

    @Override
    public User findById(Long id) {
        if (id == null)
        return null;
        return userDao.getOne(id);
    }

    @Transactional
    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    @Override
    public User save(User user) {
    User foundedUserByUsername = findByUsername(user.getUsername());
    User foundedUserByEmail = userDao.findByEmail(user.getEmail());
    if (foundedUserByUsername != null || foundedUserByEmail != null) return null;
    else {
    /*if (user.getPassword() == null || user.getPassword().isEmpty()) {
    user.setPassword(bCryptPasswordEncoder.encode(user.getUsername()));
    }
    else {
    user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    }*/
    user.setPassword(bCryptPasswordEncoder.encode("123"));
    user.setAccountNonExpired(true);
    user.setAccountNonLocked(true);
    user.setCredentialsNonExpired(true);
    user.setEnabled(true);
    user.setPasswordChanged(false);
    user.setCreatedAt(LocalDateTime.now());

    if (user.getRoles() != null) {
    Collection<Role> roles = new ArrayList<Role>();
            for (Role role : user.getRoles()) {
            roles.add(roleService.save(role));
            }
            user.setRoles(roles);
            }
            User mySaved = userDao.save(user);
            return mySaved;
            }
            }



    @Override
    public User update(User user) {
        User foundedUser = findById(user.getId());
        if (foundedUser == null) return null;
        else {
            foundedUser.setEmail(user.getEmail());
            foundedUser.setUsername(user.getUsername());
            foundedUser.setPrenom(user.getPrenom());
            foundedUser.setNom(user.getNom());
            foundedUser.setEnabled(user.isEnabled());
            foundedUser.setCredentialsNonExpired(user.isCredentialsNonExpired());
            foundedUser.setAccountNonLocked(user.isAccountNonLocked());
            foundedUser.setAccountNonExpired(user.isAccountNonExpired());
            foundedUser.setAuthorities(new ArrayList<>());
            Collection<Role> roles = new ArrayList<Role>();
            for (Role role : user.getRoles()) {
            	roles.add(roleService.save(role));
            }
            foundedUser.setRoles(roles);
            return userDao.save(foundedUser);
        }
    }

    @Override
    @Transactional
    public int delete(Long id) {
        User foundedUser = findById(id);
        if (foundedUser == null) return -1;
        userDao.delete(foundedUser);
        return 1;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findByUsernameWithRoles(username);
    }






    private void blockOrDeblockUser(User user) {
        if (!user.getAccountNonLocked()) {
            LocalDateTime blockedAt = user.getBlockedAt();
            if (blockedAt != null) {
                LocalDateTime unblockedAt = blockedAt.plusMinutes(BLOCKED_TIME);
                if (LocalDateTime.now().isAfter(unblockedAt)) {
                    user.setAccountNonLocked(true);
                    user.setBlockedAt(null);
                    user.setLoginAttempts(0);
                }
            }
        } else if (user.getLoginAttempts() >= TRIES) {
            user.setAccountNonLocked(false);
            user.setBlockedAt(LocalDateTime.now());
        } else {
            user.setLoginAttempts(user.getLoginAttempts() + 1);
        }
        userDao.save(user);
    }


   /* private void blockOrDeblockUser(User user) {
        if (!user.getAccountNonLocked()) {
            LocalDateTime blockedAt = user.getBlockedAt();
            if (blockedAt != null) {
                LocalDateTime unblockedAt = blockedAt.plusMinutes(BLOCKED_TIME);
                if (LocalDateTime.now().isAfter(unblockedAt)) {
                    user.setAccountNonLocked(true);
                    user.setBlockedAt(null);
                    user.setLoginAttempts(0);
                }
            }
        } else if (user.getLoginAttempts() >= TRIES) {
            user.setAccountNonLocked(false);
            user.setBlockedAt(LocalDateTime.now());
            user.setLoginAttempts(user.getLoginAttempts() + 1); // Increment the login attempts
        } else {
            user.setLoginAttempts(user.getLoginAttempts() + 1); // Increment the login attempts
        }
        userDao.save(user);
    }*/

    public void updateFailedLogin(String username) {
        User user = userDao.findByUsername(username);
        blockOrDeblockUser(user);
    }

    public void updateSuccessfulLogin(String username) {
        User user = userDao.findByUsername(username);
        blockOrDeblockUser(user);
    }

    public void loginOrBlock(String username) {
        User user = userDao.findByUsername(username);
        if (user != null && !user.getAccountNonLocked()) {
            blockOrDeblockUser(user);
            if (!user.getAccountNonLocked()) {
                throw new RuntimeException();
            }
        }
    }

    private static final int TRIES = 10;
    private static final int BLOCKED_TIME = 30;

}
