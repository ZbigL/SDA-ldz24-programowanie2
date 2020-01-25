package pl.sdacademy.intermediate.basic.basic8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Piotr Zietek
 */
class BookStoreInitializer {

    List<Book> initBookStore() {
        List<Book> books = new ArrayList<>();
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
                        .yearPushlished(yearPublished)
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
