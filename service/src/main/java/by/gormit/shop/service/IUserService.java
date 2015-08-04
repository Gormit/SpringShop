package by.gormit.shop.service;

import by.gormit.shop.pojos.User;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Gormit on 03.08.2015.
 */
public interface IUserService {

    List<User> getAll();
    void save(User user);
    User get(Serializable id);
    User getUserByMailAndPassword(String mail, String password);
}
