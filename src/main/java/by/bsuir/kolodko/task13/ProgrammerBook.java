package by.bsuir.kolodko.task13;

import java.util.Objects;

public class ProgrammerBook extends Book{
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, String language, int level) {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        ProgrammerBook programmerBook = (ProgrammerBook) o;
        if (!super.equals(programmerBook)) return false;
        return level == programmerBook.level && language.equals(programmerBook.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), language, level);
    }

    @Override
    public String toString() {
        return "ProgrammerBook (language=" + language +
                ", level=" + level + ')';
    }
}
