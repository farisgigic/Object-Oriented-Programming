package Week_13.SixthTask;

import java.util.List;
interface CoffeeBuilder{
    void buildType(String type);
    void buildSize(int size); // 1 , 2 , 3
    void buildToppings(List<String> toppings);
}
public class Coffee {
    private String type;
    private int size;
    private List<String> toppings;
    public Coffee(String type,int size, List<String> toppings){
        this.size = size;
        this.type = type;
        this.toppings = toppings;
    }

    public int getSize() {
        return size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
class EspressoBuilder implements CoffeeBuilder
{
    private Coffee coffee;
    public EspressoBuilder(){
        this.coffee = new Coffee("Espresso",0,null);
    }
    @Override
    public void buildType(String type){
        this.coffee = new Coffee(type,coffee.getSize(),coffee.getToppings());
    }
    @Override
    public void buildSize(int size){
        this.coffee = new Coffee(coffee.getType(),size,coffee.getToppings());
    }
    @Override
    public void buildToppings(List<String> toppings){
        this.coffee= new Coffee(coffee.getType(),coffee.getSize(),toppings);
    }
}
class CoffeeDirector
{
    public void constructCoffee(CoffeeBuilder coffeeBuilder){
        coffeeBuilder.buildSize(1);
        coffeeBuilder.buildToppings(List.of("Milk","Sugar"));
        coffeeBuilder.buildType("Espresso");

    }
}
class BuilderMain
{
    public static void main(String[] args) {
        CoffeeDirector coffeeDirector = new CoffeeDirector();
        EspressoBuilder espressoBuilder = new EspressoBuilder();
        coffeeDirector.constructCoffee(espressoBuilder);
    }
}