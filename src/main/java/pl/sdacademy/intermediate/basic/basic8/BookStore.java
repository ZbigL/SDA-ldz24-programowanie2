package pl.sdacademy.intermediate.basic.basic8;

import lombok.Getter;

import java.io.FileNotFoundException;
import java.util.List;


@Getter
public class BookStore {
    private List<Book> books;

    public BookStore() throws FileNotFoundException {
        this.books = new BookStoreInitializer().initBookStore();
    }

    // List<Book>

}
