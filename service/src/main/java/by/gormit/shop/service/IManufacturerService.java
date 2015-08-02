package by.gormit.shop.service;


import by.gormit.shop.pojos.Manufacturer;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Gormit on 02.08.2015.
 */
public interface IManufacturerService {

    List<Manufacturer> getAll();
    Manufacturer get(Serializable id);
}
