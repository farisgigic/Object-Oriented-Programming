package Week5.Task2;

public class CD extends Thing implements ToBeStored{
    private String artist;
    private String title;
    private int publishingYear;
    //private double weight;

    public CD(String artist, String title, int publishingYear) {
        super(0.1);
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        //this.weight = 0.1;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }

    public double weight() {
        return 0;
    }
}
