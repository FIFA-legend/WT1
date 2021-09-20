package by.bsuir.kolodko.task14;

public class Task {

    public static void main(String[] args) {
        Book book = new Book("Author", "Title", 120);
        Book copy = (Book) book.clone();

        System.out.println("Book == copy: " + (book == copy));
        System.out.println("Book equals copy: " + book.equals(copy));
    }

}
