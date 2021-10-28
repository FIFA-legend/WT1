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

        BookTitleComparator bookTitleComparator = new BookTitleComparator();
        BookTitleAndAuthorComparator bookTitleAndAuthorComparator = new BookTitleAndAuthorComparator();
        BookAuthorAndTitleComparator bookAuthorAndTitleComparator = new BookAuthorAndTitleComparator();
        BookAuthorAndTitleAndPriceComparator bookAuthorAndTitleAndPriceComparator = new BookAuthorAndTitleAndPriceComparator();

        System.out.println(books);

        books.sort(bookTitleComparator);
        System.out.println(books);

        books.sort(bookTitleAndAuthorComparator);
        System.out.println(books);

        books.sort(bookAuthorAndTitleComparator);
        System.out.println(books);

        books.sort(bookAuthorAndTitleAndPriceComparator);
        System.out.println(books);
    }

}
