package by.bsuir.kolodko.task15;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String isbn;
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String isbn, String title, String author, int price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, price);
    }

    @Override
    public String toString() {
        return "Book (isbn=" + isbn +
                ", title=" + title +
                ", author=" + author +
                ", price=" + price + ')';
    }

    @Override
    public int compareTo(Book o) {
        return isbn.compareTo(o.isbn);
    }
}

