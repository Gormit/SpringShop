package by.gormit.shop.controller;

import by.gormit.shop.pojos.User;
import by.gormit.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Gormit on 03.08.2015.
 */

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(value = "/admin/users", method = RequestMethod.GET)
    public String allUsersList(ModelMap map) {
        List<User> users = userService.getAll();
        map.put("users", users);
        return "users";
    }
}
