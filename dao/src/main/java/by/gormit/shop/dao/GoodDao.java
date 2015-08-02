package by.gormit.shop.dao;

import by.gormit.shop.pojos.Good;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Gormit on 12.06.2015.
 */

@Repository
public class GoodDao extends BaseDao<Good> implements IGoodDao {

    private static Logger log = Logger.getLogger(GoodDao.class);


    @Autowired
    public GoodDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }


//
//    @Override
//    public List<Good> getGoods(String hql, int countResultInt, int startResult) {
//        Query query = getSession().createQuery(hql);
//        query.setFirstResult(startResult);
//        query.setMaxResults(countResultInt);
//        return query.list();
//    }

    @Override
    public List<Good> getAll() {
        Query query = getSession().createQuery("FROM Good");
        return query.list();
    }

//    /**
//     *
//     * @return  Categoriy from entity Good FROM database
//     */
//    @Override
//    public String getGoodCategory(long goodId) {
//        String hql = "SELECT categoryName FROM Category WHERE categoryId = (SELECT categoryId FROM Good WHERE goodId =:goodID)";
//        return (String) getSession().createQuery(hql).uniqueResult();
//    }

//    /**
//     *
//     * @return list Manufacturers from entity Good FROM database
//     */
//    @Override
//    public List<String> getManufacturers() {
//        String hql = "SELECT DISTINCT manufacturers FROM Good";
//        return getSession().createQuery(hql).list();
//    }

//    @Override
//    public long getCountGoods() {
//        String hql = "SELECT count(name) FROM Good";
//        return (long) getSession().createQuery(hql).uniqueResult();
//    }

}
