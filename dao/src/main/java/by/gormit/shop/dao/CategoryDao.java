package by.gormit.shop.dao;

import by.gormit.shop.pojos.Category;
import by.gormit.shop.pojos.Good;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Gormit on 23.06.2015.
 */

@Repository
public class CategoryDao extends BaseDao<Category> implements ICategoryDao {

    private static Logger log = Logger.getLogger(CategoryDao.class);


    @Autowired
    public CategoryDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List<Category> getAll() {
        Query query = getSession().createQuery("FROM Category");
        return query.list();
    }

    @Override
    public List<Good> getGoodsByCategoryId(int categoryId) {
        Category category = (Category) getSession().get(Category.class, categoryId);
        Criteria criteria = getSession().createCriteria(Good.class)
                .add(Restrictions.like("category", category));
        return criteria.list();
    }
}
