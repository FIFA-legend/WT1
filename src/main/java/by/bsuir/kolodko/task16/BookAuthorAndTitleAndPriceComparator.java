package by.bsuir.kolodko.task16;

import java.util.Comparator;

public class BookAuthorAndTitleAndPriceComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (!o1.getAuthor().equals(o2.getAuthor())) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        } else if (!o1.getTitle().equals(o2.getTitle())) {
            return o1.getTitle().compareTo(o2.getTitle());
        } else {
            return Integer.compare(o1.getPrice(), o2.getPrice());
        }
    }

}
