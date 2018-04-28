package spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 28.04.2018.
 */

@org.springframework.stereotype.Controller //Данный класс будет отвечать на веб запросы
public class Controller {
    @Autowired //Позволяет с помощу бина создать обэект класса 1 раз
    JdbcTemplate template;

    @RequestMapping("/") //Данный метод будет обраюатывать корневой URL
    public String index(Model model) {
        model.addAttribute("books",this.getBooks());
        return "index";
    }

    private List<Book> getBooks(){
        return template.query(
                "SELECT * FROM books_market ",
                new RowMapper<Book>() {
                    @Override
                    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                        return new Book(resultSet.getInt("id"),
                                resultSet.getString("title"),
                                resultSet.getString("author"));
                    }
                }
        );
    }

    public class Book{
        private int id;
        private String title;
        private String author;

        public Book() {
        }

        public Book(int id, String title, String author) {
            this.id = id;
            this.title = title;
            this.author = author;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "author='" + author + '\'' +
                    ", title='" + title + '\'' +
                    ", id=" + id +
                    '}';
        }
    }
}
