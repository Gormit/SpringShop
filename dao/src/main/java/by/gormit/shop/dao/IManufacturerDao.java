package by.gormit.shop.dao;

import by.gormit.shop.pojos.Manufacturer;

import java.util.List;

/**
 * Created by Gormit on 02.08.2015.
 */
public interface IManufacturerDao extends IDao<Manufacturer>{

    List<Manufacturer> getAll();
}
