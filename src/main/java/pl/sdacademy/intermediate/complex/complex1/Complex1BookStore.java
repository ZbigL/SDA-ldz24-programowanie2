package pl.sdacademy.intermediate.complex.complex1;

import java.util.List;

/**
 * @author Zbigniew Lemiesz
 */
public class Complex1BookStore {
    public static void main(String[] args) {
        BookFilterCriteria criteria = BookFilterCriteria.builder()
                .authorPart("sap")
                .yearsRange(new IntRange(1995, 2000))
                .build();

        BookFilterCriteria criteria2 = BookFilterCriteria.builder()
                .priceRange(new DoubleRange(30, 55))
                .yearsRange(new IntRange(1990, 2000))
                .build();

        BookStore bookStore = new BookStore();

        List<Book> bookList = bookStore.findBookByFilterCriteria(criteria);
        System.out.println("\n-------------------Lista książek wg criteria----------------------------\n");
        System.out.println(bookList);
        System.out.println("\n-------------------Lista książek wg criteria----------------------------\n");
        for (Book book : bookList) {
            System.out.println(book.toBookShortInfo());
        }

        System.out.println("\n-------------------Lista książek wg criteria2---------------------------\n");
        List<Book> bookList2 = bookStore.findBookByFilterCriteria(criteria2);
        for (Book book : bookList2) {
            System.out.println(book.toBookShortInfo());
        }
    }
}
