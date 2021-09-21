package by.bsuir.kolodko.task16;

import java.util.Comparator;

public class BookComparators {

    public Comparator<Book> bookTitleComparator = Comparator.comparing(Book::getTitle);

    public Comparator<Book> bookTitleAndAuthorComparator = (o1, o2) -> {
        if (!o1.getTitle().equals(o2.getTitle())) {
            return o1.getTitle().compareTo(o2.getTitle());
        } else {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    };

    public Comparator<Book> bookAuthorAndTitleComparator = (o1, o2) -> {
        if (!o1.getAuthor().equals(o2.getAuthor())) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        } else {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    };

    public Comparator<Book> bookAuthorAndTitleAndPriceComparator = (o1, o2) -> {
        if (!o1.getAuthor().equals(o2.getAuthor())) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        } else if (!o1.getTitle().equals(o2.getTitle())) {
            return o1.getTitle().compareTo(o2.getTitle());
        } else {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        }
    };

}
