package by.gormit.shop.dao;

import by.gormit.shop.pojos.User;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Gormit on 03.08.2015.
 */

@Repository
public class UserDao extends BaseDao<User> implements IUserDao{

    private static Logger log = Logger.getLogger(UserDao.class);

    @Autowired
    public UserDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List<User> getAll() {
        Query query = getSession().createQuery("FROM User");
        return query.list();
    }
}
