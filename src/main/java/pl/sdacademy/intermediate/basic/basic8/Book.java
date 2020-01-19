package pl.sdacademy.intermediate.basic.basic8;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@ToString
@Getter
public class Book {
    String title;
    String author;
    int yearPublished;
    int numberOfPages;
    double price;
    Genre genre;
}
