package by.gormit.shop.dao;

import by.gormit.shop.pojos.Category;
import by.gormit.shop.pojos.Good;

import java.util.List;

/**
 * Created by Gormit on 23.06.2015.
 */
public interface ICategoryDao extends IDao<Category>{

    List<Category> getAll();
    List<Good> getGoodsByCategoryId(int categoryId);
}
