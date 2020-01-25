package pl.sdacademy.intermediate.basic.basic8;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Zbigniew Lemiesz
 */
public class BookStoreTest {
    private static final int NUMBER_OF_BOOKS_AFTER_INITIALIZATION = 36;
    private static final int NUMBER_OF_SAPKOWSKI_BOOKS = 8;
    private static final int NUMBER_OF_BOOKS_FROM_1999 = 3;
    private static final int NUMBER_OF_BOOKS_WITH_384_PAGES = 2;
    private static final int NUMBER_OF_BOOKS_FOR_CHIDREN = 6;
    private static final int NUMBER_OF_BOOKS_FOR_29_99 = 5;
    private static BookStore bookStore;

    @BeforeClass
    public static void setUpClass() {
        bookStore = new BookStore();
    }

    @Test
    public void testBookStoreInitialiazed() {
        Assert.assertEquals(NUMBER_OF_BOOKS_AFTER_INITIALIZATION, bookStore.getBooks().size());
    }

    @Test
    public void testFindBookByAuthor() {
        // given
        //title=Long Lost, author=Harlan Coben, yearPushlished=2009, numberOfPages=195, price=44.99, genre=CRIME_STORY
        Book longLostBook = Book.builder()
                .title("Long Lost")
                .author("Harlan Coben")
                .yearPushlished(2009)
                .numberOfPages(195)
                .price(44.99)
                .genre(Genre.CRIME_STORY)
                .build();
        //when
        List<Book> bookListByTitle = bookStore.findBooksByTitle("Long Lost");
        //then
        Assert.assertEquals(1, bookListByTitle.size());
        Assert.assertEquals(longLostBook, bookListByTitle.get(0));
    }

    @Test
    public void testFindBooksByAuthor() {
        // given
        String authorAndrzejSapkowski = "Andrzej Sapkowski";
        // when
        List<Book> sapkowskiBooks = bookStore.findBooksByAuthor(authorAndrzejSapkowski);
        //then
        Assert.assertEquals(NUMBER_OF_SAPKOWSKI_BOOKS, sapkowskiBooks.size());
        Assert.assertTrue(sapkowskiBooks.stream()
                .allMatch((book -> book.getAuthor().equals(authorAndrzejSapkowski))));
    }

    @Test
    public void testFindBooksByYear() {
        //given
        int year = 1999;
        //when
        List<Book> booksByYear = bookStore.findBooksByYear(year);
        //then
        Assert.assertEquals(NUMBER_OF_BOOKS_FROM_1999, booksByYear.size());
        Assert.assertTrue(booksByYear.stream()
                .allMatch((book -> book.getYearPushlished() == year)));
    }

    @Test
    public void testFindBookByPrice() {
        double price = 29.99;
        //when
        List<Book> booksByPrice = bookStore.findBooksByPrice(price);
        //then
        Assert.assertEquals(NUMBER_OF_BOOKS_FOR_29_99, booksByPrice.size());
        Assert.assertTrue(booksByPrice.stream()
                .allMatch((book -> BigDecimal.valueOf(book.getPrice()).equals(BigDecimal.valueOf(price)))));

    }


    @Test
    public void testFindBookByGenre() {
        //given
        int numberFOR_CHILDREN = 6;
        //when
        List<Book> booksFOR_CHILDREN = bookStore.findBooksByGenre(Genre.FOR_CHILDREN);
        //then
        Assert.assertEquals(numberFOR_CHILDREN, booksFOR_CHILDREN.size());
        Assert.assertTrue(booksFOR_CHILDREN.stream()
                .allMatch(book -> book.getGenre().equals(Genre.FOR_CHILDREN)));


    }
}
