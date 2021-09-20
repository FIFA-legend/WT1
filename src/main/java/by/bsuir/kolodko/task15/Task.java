package by.bsuir.kolodko.task15;

import java.util.Arrays;

public class Task {

    private static Book[] sort(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j].compareTo(books[j + 1]) > 0) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
        return books;
    }

    public static void main(String[] args) {
        Book book1 = new Book("2-266-11156-6", "Title1", "Author1", 100);
        Book book2 = new Book("978-5-699-12014-7", "Title2", "Author2", 100);
        Book book3 = new Book("978-5-43989-090-3", "Title2", "Author2", 100);

        Book[] books = {book1, book2, book3};
        System.out.println(Arrays.toString(sort(books)));
    }

}
