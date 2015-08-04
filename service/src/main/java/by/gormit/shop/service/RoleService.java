package by.gormit.shop.service;

import by.gormit.shop.dao.IRoleDao;
import by.gormit.shop.pojos.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by Gormit on 03.08.2015.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class RoleService implements IRoleService {

    @Autowired
    private IRoleDao roleDao;

    @Override
    public Role get(Serializable id) {
        return roleDao.get(Role.class, id);
    }
}
