package pl.sdacademy.intermediate.complex.complex1;

import lombok.Builder;

/**
 * @author Zbigniew Lemiesz
 */
@Builder
class BookFilterCriteria {
    private String titlePart;
    private String authorPart;
    private IntRange yearsRange;
    private IntRange pagesRange;
    private DoubleRange priceRange;


    boolean matches(Book book) {
        boolean result = true;
        if (titlePart != null) result &= book.getTitle().toLowerCase().contains(titlePart.toLowerCase());
        if (authorPart != null) result &= book.getAuthor().toLowerCase().contains(authorPart.toLowerCase());
        if (yearsRange != null) result &= yearsRange.contains(book.getYearPublished());
        if (pagesRange != null) result &= pagesRange.contains(book.getNumberOfPages());
        if (priceRange != null) result &= priceRange.contains(book.getPrice());
        return result;
    }


}
