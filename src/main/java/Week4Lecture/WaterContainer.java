package Week4Lecture;



/**
 *
 *
 */
public class WaterContainer {

    private double amountOfWater;
    private double capacityOfContainer;

    public WaterContainer() {
        this.amountOfWater = 0;
        this.capacityOfContainer = 100;
    }

    public WaterContainer(double capacity) {
        this.amountOfWater = 0;
        this.capacityOfContainer = capacity;
    }

    public void addWater(double amount) {
        this.amountOfWater += amount;
        if (this.amountOfWater > this.capacityOfContainer) {
            this.amountOfWater = this.capacityOfContainer;
        }
    }

    public void useWater(double amount) {
        this.amountOfWater -= amount;
        if (this.amountOfWater < 0) {
            this.amountOfWater = 0;
        }
    }

    public boolean isEmpty() {
        if(this.amountOfWater < 0.1 )
        {
            return true;
        }
        else
        {
            return false;
        }
        //*return this.amountOfWater < 0.1;
    }

    public boolean isFull() {
        return this.amountOfWater > this.capacityOfContainer - 0.1;
    }

    public double getWaterLiters() {
        return this.amountOfWater;
    }

    public double fillUp() {
        double neededWater = this.capacityOfContainer - this.amountOfWater;
        this.amountOfWater = this.capacityOfContainer;
        return neededWater;
    }

    public static void main(String[] args) {
        WaterContainer container1 = new WaterContainer();
        WaterContainer container2 = new WaterContainer(50);

        System.out.println("Container 1:");
        System.out.println("Initial amount of water: " + container1.getWaterLiters());
        System.out.println("sada : " + container1.isEmpty());
        System.out.println("sadaaa : " + container1.isFull());
        container1.addWater(30);
        System.out.println("Amount of water after adding 30 liters: " + container1.getWaterLiters());
        container1.useWater(20);
        System.out.println("Amount of water after using 20 liters: " + container1.getWaterLiters());
        System.out.println("Is empty? " + container1.isEmpty());
        System.out.println("Is full? " + container1.isFull());
        double neededWater = container1.fillUp();
        System.out.println("After filling up, needed water: " + neededWater);
        System.out.println("Final amount of water: " + container1.getWaterLiters());

        System.out.println("\nContainer 2:");
        System.out.println("Initial amount of water: " + container2.getWaterLiters());
        System.out.println("Is empty? " + container2.isEmpty());
        System.out.println("Is full? " + container2.isFull());
}
}