package by.gormit.shop.dao;

import by.gormit.shop.pojos.Role;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Gormit on 03.08.2015.
 */

@Repository
public class RoleDao extends BaseDao<Role> implements IRoleDao{

    private static Logger log = Logger.getLogger(RoleDao.class);

    @Autowired
    public RoleDao(SessionFactory sessionFactory) {
        super(sessionFactory);
    }
}
