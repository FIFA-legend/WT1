package by.bsuir.kolodko.task14;

import java.util.Objects;

public class Book implements Cloneable {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (this == object) return true;
        Book book = (Book) object;
        return price == book.price && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, price);
    }



    @Override
    public String toString() {
        return "Book (title=" + title +
                ", author=" + author +
                ", price=" + price + ")";
    }

    @Override
    protected Object clone() {
        return new Book(title, author, price);
    }
}

