package by.gormit.shop.service;

import by.gormit.shop.pojos.Role;

import java.io.Serializable;

/**
 * Created by Gormit on 03.08.2015.
 */
public interface IRoleService {

    Role get(Serializable id);
}
