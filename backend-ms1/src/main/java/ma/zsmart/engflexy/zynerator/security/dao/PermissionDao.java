package ma.zsmart.engflexy.zynerator.security.dao;

import ma.zsmart.engflexy.zynerator.security.bean.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionDao extends JpaRepository<Permission, Long> {
    public Permission findByName(String name);
}
