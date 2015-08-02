package by.gormit.shop.dao;

import by.gormit.shop.pojos.Good;
import by.gormit.shop.pojos.Manufacturer;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Gormit on 02.08.2015.
 */

@Repository
public class ManufacturerDao extends BaseDao<Manufacturer> implements IManufacturerDao{

    private static Logger log = Logger.getLogger(ManufacturerDao.class);

    @Autowired
    public ManufacturerDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List<Manufacturer> getAll() {
        Query query = getSession().createQuery("FROM Manufacturer");
        return query.list();
    }
}
