package spring.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by admin on 28.04.2018.
 */

@ComponentScan // Выполнянет рекурсивынй поиск по папкам проекта
@EnableAutoConfiguration // Включает авто конфигурирование
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);

    }
}
