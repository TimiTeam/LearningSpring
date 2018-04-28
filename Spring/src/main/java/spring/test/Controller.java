package spring.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 28.04.2018.
 */

@RestController //Данный класс будет отвечать на веб запросы
public class Controller {


    @RequestMapping("/") //Данный метод будет обраюатывать корневой URL
    public String index(){
        return "index";
    }
}
