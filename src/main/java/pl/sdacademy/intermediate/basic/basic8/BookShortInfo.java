package pl.sdacademy.intermediate.basic.basic8;

import lombok.Builder;
import lombok.ToString;

/**
 * @author Piotr Zietek
 */
@Builder
@ToString
class BookShortInfo {

    private String title;
    private String author;
    private int yearPushlished;
}
