package Week5;

public class Circle extends Shape
{
    private String color;
    private FillType type;
    private double radius ;
    public Circle(String color, FillType type, double radius)
    {
        super(color,type);
        this.radius=radius;
    }
    @Override
    public String displayInfo(){
        return color + " " + type + " " + radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference(double PI, double r){
        return 2* PI * r;
    }
    public double calculateCircumference(double r)
    {
        return 2 * 3.14* r;
    }
    public String toString(){
        return getColor()+ " " + getType()+ " "+ radius;
    }
    public static void main(String[] args)
    {
        Circle krug = new Circle("Bordoo", FillType.FILLED,5);
        System.out.println(krug);
        System.out.println(krug.calculateCircumference(3.14,5.4));
        System.out.println(krug.calculateCircumference(5.4));


    }
}
