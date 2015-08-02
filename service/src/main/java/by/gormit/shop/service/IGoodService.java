package by.gormit.shop.service;

import by.gormit.shop.pojos.Good;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Gormit on 12.06.2015.
 */
public interface IGoodService {

    List<Good> getAll();
    Good get(Serializable id);
    void update(Good good);
    void saveOrUpdate(Good good);
//    String getGoodCategory(long goodId);
//    List<String> getManufacturers();
}
