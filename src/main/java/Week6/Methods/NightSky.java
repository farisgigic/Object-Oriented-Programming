package Week6.Methods;

import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;

    public int starsInLastPrint;
    public int rowCount;
    public int printCount;

    Random random = new Random();

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printLine() {
        this.rowCount = 0;
        for(int i = 0; i < this.width; i++) {
            double rnd = random.nextDouble(100); // RND = 11.243155128759586
            double probability = Math.floor(this.density * 100); // PROB = 11.0
//            System.out.println("RND = " + rnd + ", PROB = " + probability);
            if(rnd < probability) {
                System.out.print("*");
                this.rowCount++;
            } else {
                System.out.print(" ");
            }
        }
    }

    public void print() {
        this.printCount = 0;
        for(int i = 0; i < this.height; i++) {
            printLine();
            printCount += this.rowCount;
            if (i != this.height -1) {
                System.out.println();
            }
        }
        this.starsInLastPrint = this.printCount;
    }

    public void numberOfStarsInLastPrint() {
        System.out.println("Number of stars: " + this.starsInLastPrint);
    }
}