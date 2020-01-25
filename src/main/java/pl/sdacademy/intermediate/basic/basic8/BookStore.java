package pl.sdacademy.intermediate.basic.basic8;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Piotr Zietek
 */
@Getter
class BookStore {

    private List<Book> books;

    BookStore() {
        this.books = new BookStoreInitializer().initBookStore();
    }

    List<Book> findBooksByTitle(String title) {
        return this.books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByYear(int year) {
        return books.stream()
                .filter(book -> book.getYearPushlished() == year)
                .collect(Collectors.toList());
    }

    List<Book> findBooksByNumberOfPages(int numberOfPages) {
        return books.stream()
                .filter(book -> book.getNumberOfPages() == numberOfPages)
                .collect(Collectors.toList());
    }

    List<Book> findBooksByPrice(double price) {
        return books.stream()
                .filter(book -> BigDecimal.valueOf(book.getPrice()).equals(BigDecimal.valueOf(price)))
                .collect(Collectors.toList());
    }

    List<Book> findBooksByGenre(Genre genre) {
        return books.stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());
    }
}

