package by.bsuir.kolodko.task13;

public class Task {

    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook("Title", "Author", 100, "English", 10);
        ProgrammerBook book2 = new ProgrammerBook("Title2", "Author2", 101, "English", 10);
        ProgrammerBook book3 = new ProgrammerBook("Title", "Author", 100, "English", 10);

        System.out.println("Book1 equals Book3: " + book1.equals(book3));
        System.out.println("Book1 equals Book2: " + book1.equals(book2));

        System.out.println("Book1 hashcode: " + book1.hashCode());
        System.out.println("Book2 hashcode: " + book2.hashCode());
        System.out.println("Book3 hashcode: " + book3.hashCode());
    }

}
