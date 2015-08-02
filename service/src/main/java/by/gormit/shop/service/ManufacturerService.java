package by.gormit.shop.service;

import by.gormit.shop.dao.IManufacturerDao;
import by.gormit.shop.pojos.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Gormit on 02.08.2015.
 */

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class ManufacturerService implements IManufacturerService{

    @Autowired
    private IManufacturerDao manufacturerDao;

    @Override
    public List<Manufacturer> getAll() {
        return manufacturerDao.getAll();
    }

    @Override
    public Manufacturer get(Serializable id) {
        return manufacturerDao.get(Manufacturer.class, id);
    }

}
