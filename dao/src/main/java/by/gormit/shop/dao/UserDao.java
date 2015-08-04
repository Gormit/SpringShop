package by.gormit.shop.dao;

import by.gormit.shop.pojos.User;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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

    @Override
    public User getUserByMailAndPassword(String mail, String password) {


//        String hql = "SELECT u FROM User u WHERE u.f_mail=:mail and u.f_password=:password";
//        Query query = getSession().createQuery(hql)
//                .setParameter("mail", mail)
//                .setParameter("password", password);
//        return (User) query.uniqueResult();
//
        Criteria criteria = getSession().createCriteria(User.class)
                .add(Restrictions.eq("mail", mail))
                .add(Restrictions.eq("password", password));
        if (criteria.list().size() > 0) {
            return (User) criteria.uniqueResult();
        } else {
            return null;
        }
    }
}
