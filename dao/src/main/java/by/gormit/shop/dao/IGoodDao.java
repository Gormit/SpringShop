package by.gormit.shop.dao;

import by.gormit.shop.pojos.Good;

import java.util.List;

/**
 * Created by Gormit on 12.06.2015.
 */
public interface IGoodDao extends IDao<Good> {

//    List<T> getGoods(String hql, int countResultInt, int startResult);
    List<Good> getAll();
//    String getGoodCategory(long goodId);
//    List<String> getManufacturers();
//    long getCountGoods();
}
