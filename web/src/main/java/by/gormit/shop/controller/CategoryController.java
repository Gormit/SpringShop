package by.gormit.shop.controller;

import by.gormit.shop.pojos.Category;
import by.gormit.shop.pojos.Good;
import by.gormit.shop.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Gormit on 23.06.2015.
 */

@Controller
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public ModelAndView allCategoriesList() {
        ModelAndView modelAndView = new ModelAndView();
        List<Category> categories = categoryService.getAll();
        modelAndView.addObject("categories", categories);
        return modelAndView;
    }

    @RequestMapping(value = "/category/view/{categoryId}", method = RequestMethod.GET)
    public String categoryView(ModelMap model, @PathVariable String categoryId) {
        int id = Integer.parseInt(categoryId);
        List<Good> goods = categoryService.getGoodsByCategoryId(id);
        model.put("goods", goods);
        return "welcome";
    }
}
