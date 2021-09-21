package by.bsuir.kolodko.task16;

import java.util.LinkedList;
import java.util.List;

public class Task {

    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        Book book1 = new Book("A", "A", 10);
        Book book2 = new Book("B", "B", 11);
        Book book3 = new Book("A", "C", 12);
        Book book4 = new Book("B", "C", 12);
        books.add(book4);
        books.add(book3);
        books.add(book2);
        books.add(book1);

        BookComparators comparators = new BookComparators();
        System.out.println(books);

        books.sort(comparators.bookTitleComparator);
        System.out.println(books);

        books.sort(comparators.bookTitleAndAuthorComparator);
        System.out.println(books);

        books.sort(comparators.bookAuthorAndTitleComparator);
        System.out.println(books);

        books.sort(comparators.bookAuthorAndTitleAndPriceComparator);
        System.out.println(books);
    }

}
