
package by.gormit.shop.controller;

import by.gormit.shop.pojos.Good;
import by.gormit.shop.service.ICategoryService;
import by.gormit.shop.service.IGoodService;
import by.gormit.shop.service.IManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class GoodController {

    @Autowired
    private IGoodService goodService;

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IManufacturerService manufacturerService;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String allGoodsList(ModelMap model) {
        List<Good> goods = goodService.getAll();
        model.put("goods", goods);
        return "welcome";
    }

    @RequestMapping(value = "/good/viewGood/{goodId}", method = RequestMethod.GET)
    public String goodView(ModelMap model, @PathVariable long goodId) {
        Good good = goodService.get(goodId);
        model.put("good", good);
        return "viewGood";
    }

    @RequestMapping(value = "/admin/editGood/{goodId}", method = RequestMethod.GET)
    public String editGood (ModelMap model, @PathVariable String goodId) {
        Good good;
        if ("".equals(goodId)) {
            good = new Good();
        } else {
            long id = Long.parseLong(goodId);
            good = goodService.get(id);
        }
        model.put("categoryList", categoryService.getAll());
        model.put("manufacturerList", manufacturerService.getAll());
        model.put("good", good);
        return "editGood";
    }

    @RequestMapping(value = "/admin/saveGood", method = RequestMethod.GET)
    public String addGood (HttpServletRequest req,
                           @ModelAttribute Good good,
                           ModelMap model) {
        good.setCategory(categoryService.get(Integer.parseInt(req.getParameter("categoryId"))));
        good.setManufacturer(manufacturerService.get(Integer.parseInt(req.getParameter("manufacturerId"))));
        goodService.saveOrUpdate(good);
        model.put("good", good);
        return "viewGood";
    }

    @RequestMapping(value = "/good/buyGood/{goodId}", method = RequestMethod.GET)
    public String buyGood(ModelMap model, @PathVariable long goodId) {
        Good good = goodService.get(goodId);
        good.setCount(good.getCount() - 1);
        goodService.update(good);
        List<Good> goods = goodService.getAll();
        model.put("goods", goods);
        return "welcome";
    }


}
