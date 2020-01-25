package pl.sdacademy.intermediate.complex.complex1;

import lombok.Builder;
import lombok.ToString;

import java.util.UUID;

/**
 * @author Piotr Zietek
 */
@Builder
@ToString
class BookShortInfo {

    UUID id;
    private String title;
    private String author;
    private int yearPublished;

    BookShortInfo toBookShortInfo(Book book) {
        return builder()
                .id(this.id)
                .title(title)
                .author(author)
                .yearPublished(yearPublished)
                .build();
    }
}
