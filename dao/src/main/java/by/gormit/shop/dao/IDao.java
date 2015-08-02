package by.gormit.shop.dao;

import java.io.Serializable;

/**
 * Created by Gormit on 01.06.2015.
 * Unified Management Interface persistent state of objects
 * @param <T> type of object persistence
 * Persistence object - a storage facility in a constant state persistence mechanism such as a database.
 */

public interface IDao<T> {

    T add(T t);
    void update(T t);
    T get(Class<T> clazz, Serializable id);
    void delete(T t);
    void saveOrUpdate(T t);
}
