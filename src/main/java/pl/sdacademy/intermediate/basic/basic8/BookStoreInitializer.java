package pl.sdacademy.intermediate.basic.basic8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookStoreInitializer {

    List<Book> initBookStore() throws FileNotFoundException {
        File file = new File("books.txt");
        Scanner in = new Scanner(file);
        List<Book> books = new ArrayList<>();
        while (in.hasNextLine()) {
            String bookLine = in.nextLine();
            String[] splitBookline = bookLine.split("\\|");
            String title = splitBookline[0];
            String author = splitBookline[1];
            int yearPublished = Integer.parseInt(splitBookline[2]);
            int numberOfPages = Integer.parseInt(splitBookline[3]);
            double price = Double.parseDouble(splitBookline[4]);
            Genre genre = Genre.valueOf(splitBookline[5]);
            Book book = Book.builder()
                    .title(title)
                    .author(author)
                    .yearPublished(yearPublished)
                    .numberOfPages(numberOfPages)
                    .price(price)
                    .genre(genre)
                    .build();
            books.add(book);
            System.out.println(bookLine);
        }
        return books;
    }
}
