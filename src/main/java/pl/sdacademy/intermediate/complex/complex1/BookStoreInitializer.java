package pl.sdacademy.intermediate.complex.complex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Piotr Zietek
 */

class BookStoreInitializer {

    Set<Book> initBookStore() {
        Set<Book> books = new HashSet<Book>();
        String booksFilePathFromResources = getClass().getClassLoader().getResource("books.txt").getFile();
        File booksFile = new File(booksFilePathFromResources);
        try {
            Scanner scanner = new Scanner(booksFile);
            while (scanner.hasNext()) {
                String bookLine = scanner.nextLine();
                String[] bookLineSplit = bookLine.split("\\|");
                String title = bookLineSplit[0];
                String author = bookLineSplit[1];
                int yearPublished = Integer.valueOf(bookLineSplit[2]);
                int numberOfPages = Integer.valueOf(bookLineSplit[3]);
                double price = Double.valueOf(bookLineSplit[4]);
                Genre genre = Genre.valueOf(bookLineSplit[5]);
                Book book = Book.builder()
                        .title(title)
                        .author(author)
                        .yearPublished(yearPublished)
                        .numberOfPages(numberOfPages)
                        .price(price)
                        .genre(genre)
                        .build();
                System.out.println(book);
                books.add(book);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return books;
    }

}
