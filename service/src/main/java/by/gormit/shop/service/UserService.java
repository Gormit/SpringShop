package by.gormit.shop.service;

import by.gormit.shop.dao.IUserDao;
import by.gormit.shop.dao.UserDao;
import by.gormit.shop.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Gormit on 03.08.2015.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    public UserService() {
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }
}
