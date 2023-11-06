package Week5.Task2;

public class Book extends Thing implements ToBeStored{
    private String writer;
    private String name;


    public Book(String writer, String name, double weight) {
        super(weight);
        this.writer = writer;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.writer + ": " + this.name;
    }

    public double weight() {
        return 0;
    }
}
