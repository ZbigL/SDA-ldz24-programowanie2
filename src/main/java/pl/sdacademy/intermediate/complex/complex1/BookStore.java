package pl.sdacademy.intermediate.complex.complex1;

import lombok.Getter;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Piotr Zietek
 */
@Getter
class BookStore {

    private Set<Book> books;

    BookStore() {
        this.books = new BookStoreInitializer().initBookStore();
    }


    List<Book> findBookByFilterCriteria(BookFilterCriteria criteria) {
        return this.books.stream()
                .filter(book -> criteria.matches(book))
                .collect(Collectors.toList());
    }
}

