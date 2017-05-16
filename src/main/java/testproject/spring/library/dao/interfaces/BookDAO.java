package testproject.spring.library.dao.interfaces;


import testproject.spring.library.entities.*;

import java.util.List;

public interface BookDAO {

    List<Book> getBooks();
    List<Book> getBooks(Author author);
    List<Book> getBooks(Genre genre);
    List<Book> getBooks(Publisher publisher);
    List<Book> getBooks(Character letter);

}
