package by.gormit.shop.controller;

import by.gormit.shop.pojos.User;
import by.gormit.shop.service.IRoleService;
import by.gormit.shop.service.IUserService;
import com.mysql.jdbc.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Gormit on 03.08.2015.
 */

@Controller
public class UserController {

    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @RequestMapping(value = "/admin/users", method = RequestMethod.GET)
    public String allUsersList(ModelMap map) {
        List<User> users = userService.getAll();
        map.put("users", users);
        return "users";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String registrationForm() {
        return "registration";
    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registration(HttpServletRequest req,
                               @ModelAttribute User user,
                               ModelMap map) {
        if (!StringUtils.isNullOrEmpty(req.getParameter("mail")) &
            !StringUtils.isNullOrEmpty(req.getParameter("password")) &
            null == userService.getUserByMailAndPassword(req.getParameter("mail"), req.getParameter("password"))) {

                user.setRole(roleService.get(2l)); //Hardcode... user can register only like Buyer
                userService.save(user);
                return "thanks";

        } else {
            map.put("message", "Чувак, будь пооригенальнее )))");
            return "registration";
        }

    }
}
