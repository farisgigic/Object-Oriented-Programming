package Week5.Task3;

import java.util.ArrayList;

public class BlackHoleBox extends Box{
    private ArrayList<Thing> things = new ArrayList<>();

    public BlackHoleBox() {

    }

    public ArrayList<Thing> getThings() {
        return things;
    }

    @Override
    public void add(Thing thing) {
        this.things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }

}