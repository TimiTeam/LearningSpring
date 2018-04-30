package spring.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.test.dao.BooksDAO;
import spring.test.models.Book;

import java.util.List;

/**
 * Created by admin on 30.04.2018.
 */
@Service
public class BookServicesImpl implements BookServices{
    @Autowired
    BooksDAO dao;

    public List<Book> getBooks(){
        return dao.getBooks();
    }
}
