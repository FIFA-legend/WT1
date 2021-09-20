package by.bsuir.kolodko.task12;

public class Task {

    public static void main(String[] args) {
        Book book1 = new Book("Title", "Author", 100);
        Book book2 = new Book("Another Title", "Another Author", 1);
        Book book3 = new Book("Title", "Author", 100);

        System.out.println("Book1 equals Book2: " + book1.equals(book2));
        System.out.println("Book1 equals Book3: " + book1.equals(book3));

        System.out.println("Book1 hashcode: " + book1.hashCode());
        System.out.println("Book2 hashcode: " + book2.hashCode());
        System.out.println("Book3 hashcode: " + book3.hashCode());

        System.out.println(book1);
    }

}
