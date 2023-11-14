package week06.Lab.LibraryInformationSystem;

public class Book {
    private String title;
    private String publisher;
    private int year;

    public Book(String title, String publisher, int year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public int year() {
        return year;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.publisher + ", " + this.year;
    }
}