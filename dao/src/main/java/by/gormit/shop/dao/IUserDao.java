package by.gormit.shop.dao;

import by.gormit.shop.pojos.User;

import java.util.List;

/**
 * Created by Gormit on 03.08.2015.
 */

public interface IUserDao extends IDao<User>{

    List<User> getAll();
}
