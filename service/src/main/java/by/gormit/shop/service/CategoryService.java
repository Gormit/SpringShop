package by.gormit.shop.service;

import by.gormit.shop.dao.ICategoryDao;
import by.gormit.shop.pojos.Category;
import by.gormit.shop.pojos.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Gormit on 23.06.2015.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class CategoryService implements ICategoryService {

    @Autowired
    private ICategoryDao categoryDao;

    public CategoryService() {
    }

    @Override
    public List<Category> getAll() {
        return categoryDao.getAll();
    }

    @Override
    public Category get(Serializable id) {
        return categoryDao.get(Category.class, id);
    }

    @Override
    public List<Good> getGoodsByCategoryId(int categoryId) {
        return categoryDao.getGoodsByCategoryId(categoryId);
    }
}
