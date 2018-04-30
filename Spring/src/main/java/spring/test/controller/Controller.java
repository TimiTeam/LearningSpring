package spring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.test.services.BookServices;
import spring.test.services.BookServicesImpl;


/**
 * Created by admin on 28.04.2018.
 */

@org.springframework.stereotype.Controller //Данный класс будет отвечать на веб запросы
public class Controller {

    @Autowired
    BookServices bookServices;

    @RequestMapping("/") //Данный метод будет обраюатывать корневой URL
    public String index(Model model) {
        model.addAttribute("books", bookServices.getBooks());
        return "index";
    }

}
