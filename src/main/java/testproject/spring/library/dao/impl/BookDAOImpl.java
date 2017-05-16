package testproject.spring.library.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import testproject.spring.library.dao.interfaces.BookDAO;
import testproject.spring.library.entities.Author;
import testproject.spring.library.entities.Book;
import testproject.spring.library.entities.Genre;
import testproject.spring.library.entities.Publisher;

import java.util.List;

@Component
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private List<Book> books;

    @Transactional
    public List<Book> getBooks() {
        books = (List<Book>) sessionFactory.getCurrentSession().createCriteria(Book.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return books;
    }

    public List<Book> getBooks(Author author) {
        return null;
    }

    public List<Book> getBooks(Genre genre) {
        return null;
    }

    public List<Book> getBooks(Publisher publisher) {
        return null;
    }

    public List<Book> getBooks(Character letter) {
        return null;
    }
}
