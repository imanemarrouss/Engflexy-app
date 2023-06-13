package ma.zsmart.engflexy.zynerator.security.service.impl;

import ma.zsmart.engflexy.zynerator.security.bean.Permission;
import ma.zsmart.engflexy.zynerator.security.dao.PermissionDao;
import ma.zsmart.engflexy.zynerator.security.service.facade.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionDao permissionDao;

    @Override
    public Permission save(Permission permission) {
        Permission perm = permissionDao.findByName(permission.getName());
        return perm == null ? permissionDao.save(permission) : perm;
    }
}
