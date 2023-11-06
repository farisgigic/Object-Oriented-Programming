package Week5.Task2;
import java.util.ArrayList;
import java.util.List;

public class Box{
    private double maxWeight;
    private ArrayList<Thing> things = new ArrayList<>();
    private double currentWeight;
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void add(Thing thing) {
        if(thing.getWeight() > this.maxWeight - this.currentWeight) {
            System.out.println("Too much weight");
        } else {
            currentWeight += thing.getWeight();
            this.things.add(thing);
        }
    }

    @Override
    public String toString() {
        return "Box: " + this.things.size() + " things, total weight: " + this.currentWeight;
    }
}
