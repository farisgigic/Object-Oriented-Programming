package Week4;

public class Rectangle extends Shape {
    private double width;
    private double height;
    private String color;
    private FillType type;
    public Rectangle(double width, double height, String color, FillType type)
    {
        super(color,type);
        this.width = width;
        this.height  = height;
    }
    @Override
    public String displayInfo()
    {
        return ("Width : " + width + " Height "+height + " Color :" + getColor() + " FillType : " + getType());

    }
    @Override
    public double getArea(){
        return width * height;
    }

    public static void main(String[] args)
    {

        Rectangle faris = new Rectangle(1.4,2.5,"Bijela", FillType.NOT_FILLED);
        System.out.println(faris.displayInfo());
        System.out.println(faris.getArea());


    }

}
