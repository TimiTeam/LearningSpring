package spring.test.dao;

import spring.test.models.Book;

import java.util.List;

/**
 * Created by admin on 30.04.2018.
 */
public interface BooksDAO {
    List<Book> getBooks();
}
