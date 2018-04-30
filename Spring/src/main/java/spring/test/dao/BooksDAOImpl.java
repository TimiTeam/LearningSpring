package spring.test.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import spring.test.models.Book;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by admin on 30.04.2018.
 */

@Repository
public class BooksDAOImpl implements BooksDAO{

    @Autowired //Позволяет с помощу бина создать обэект класса 1 раз
    JdbcTemplate template;

    public List<Book> getBooks(){
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
}
