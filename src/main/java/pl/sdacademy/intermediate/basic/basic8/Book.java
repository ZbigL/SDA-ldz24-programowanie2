package pl.sdacademy.intermediate.basic.basic8;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * @author Piotr Zietek
 */
@Builder
@ToString
@Getter
class Book {

    private String title;
    private String author;
    private int yearPublished;
    private int numberOfPages;
    private double price;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (yearPublished != book.yearPublished) return false;
        if (numberOfPages != book.numberOfPages) return false;
        if (!title.equals(book.title)) return false;
        if (!author.equals(book.author)) return false;
        return genre == book.genre;
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + yearPublished;
        result = 31 * result + numberOfPages;
        result = 31 * result + genre.hashCode();
        return result;
    }

    private Genre genre;
}
