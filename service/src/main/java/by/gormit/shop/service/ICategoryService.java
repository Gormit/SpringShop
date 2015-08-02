package by.gormit.shop.service;

import by.gormit.shop.pojos.Category;
import by.gormit.shop.pojos.Good;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Gormit on 23.06.2015.
 */
public interface ICategoryService {

    List<Category> getAll();
    Category get(Serializable id);
    List<Good> getGoodsByCategoryId(int categoryId);
}
