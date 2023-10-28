package Week5;




public class Shape {

    private String color;
    private FillType type;

    public Shape(String color, FillType type)
    {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public FillType getType() {
        return type;
    }

    public String displayInfo()
    {
        return color + " " + type;
    }
    public double getArea()
    {
        return 0.0;
    }
    public static void main(String[] args)
    {
        Shape faris = new Shape("Bordo", FillType.valueOf("NOT_FILLED"));
        System.out.println(faris.displayInfo());

    }
}

