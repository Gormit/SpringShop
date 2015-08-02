package by.gormit.shop.service;

import by.gormit.shop.dao.IGoodDao;
import by.gormit.shop.pojos.Good;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Gormit on 12.06.2015.
 */
@Service
@Transactional(propagation = Propagation.REQUIRED)
public class GoodService implements IGoodService {

    @Autowired
    private IGoodDao goodDao;

    public GoodService() {
    }

    @Override
    public List<Good> getAll() {
        return goodDao.getAll();
    }


    @Override
    public Good get(Serializable id) {
        return goodDao.get(Good.class, id);
    }

    @Override
    public void update(Good good) {
        goodDao.update(good);
    }

    @Override
    public void saveOrUpdate(Good good) {
        goodDao.saveOrUpdate(good);
    }


//    @Override
//    public String getGoodCategory(long goodId) {
//        return goodDao.getGoodCategory(goodId);
//    }

//    @Override
//    public List<String> getManufacturers() {
//        return goodDao.getManufacturers();
//    }
}
