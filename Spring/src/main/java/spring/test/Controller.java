package spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 28.04.2018.
 */

@org.springframework.stereotype.Controller //Данный класс будет отвечать на веб запросы
public class Controller {

    Semple semple ;

    @RequestMapping("/") //Данный метод будет обраюатывать корневой URL
    public String index(Model model) {
        semple = new Semple();
        model.addAttribute("counter",semple.getCounter());
        model.addAttribute("constructorCounter",semple.getConstructorCounter());
        return "index";
    }
}
