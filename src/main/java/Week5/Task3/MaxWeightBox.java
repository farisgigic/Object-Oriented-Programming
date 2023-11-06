package Week5.Task3;

import java.util.ArrayList;

public class MaxWeightBox extends Box{
    private double maxWeight;
    private ArrayList<Thing> things = new ArrayList<>();
    private double currentWeight;

    public MaxWeightBox(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    @Override
    public void add(Thing thing) {
        if(thing.getWeight() > this.maxWeight - this.currentWeight) {
            System.out.println("Too much weight!");
        } else {
            this.things.add(thing);
            this.currentWeight += thing.getWeight();
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing t : things) {
            if(t.getName().equals(thing.getName())) {
                return true;
            }
        }
        return false;
    }
}