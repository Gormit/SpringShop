
package by.gormit.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

//    redirect to start-page
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "/login/error", method = RequestMethod.GET)
    public String loginErrorPage(ModelMap model) {
        model.put("error", "Вы неправильно ввели данные для авторизации");
        return "login";
    }

    @RequestMapping(value = "/ban", method = RequestMethod.GET)
    public String banPage() {
        return "ban";
    }
}
