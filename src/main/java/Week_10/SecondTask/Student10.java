package Week_10.SecondTask;

import java.lang.reflect.Field;
import java.util.List;
import java.util.ArrayList;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class Student10 {
    private String name;
    private int ID;
    private List<Double> grades;
    public Student10(String name, int ID, List<Double> grades)
    {
        this.name =name;
        this.ID = ID;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = new ArrayList<>(grades);
    }
    public void printInfo(){
        System.out.println("Name: " + this.name + " ID: "+this.ID + " and grades: ");
        for(Double grade :grades){
            System.out.print(grade);
        }
    }
    private void privateFaris(){
        System.out.println("this is private!");
    }

}
class GradeAnalyzer
{
    private List<Double> grades;
    public GradeAnalyzer(List<Double>grades){
        this.grades=new ArrayList<>();
    }
    public void calculateAverageOfGrades(List<Double> grades){
        double sum = 0;
        int counter = 0;
        double result = 0;
        for( Double grade : grades){
            sum += grade;
        }
        System.out.println(sum/ grades.size());
    }
    private int privateToo(){
        return 99;
    }
}
class Start
{
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        List<Double> grades = new ArrayList<>();
        grades.add(0,4.6);
        grades.add(1,3.9);
        grades.add(2,5.0);
        grades.add(3,4.9);
        grades.add(4,4.56);

        GradeAnalyzer ga = new GradeAnalyzer(grades);
        ga.calculateAverageOfGrades(grades);

        Student10 faris = new Student10("Faris", 2200337,grades);

        Field[] f1 = faris.getClass().getDeclaredFields();
        for(Field f : f1){
            System.out.println(f.getName());
        }
        Method[] method = faris.getClass().getDeclaredMethods();
        Method[] method1 = ga.getClass().getDeclaredMethods();
        for(Method m : method){
            if(m.getName().startsWith("print") || m.getName().startsWith("calculate")) {
                System.out.println(m.getName());
                m.invoke(faris);
            }
        }
        for(Method m1 : method1){
            if(m1.getName().startsWith("print") || m1.getName().startsWith("calculate")){
                System.out.println(m1.getName());
                m1.setAccessible(true);
                m1.invoke(ga,grades);
            }
        }

    }
}
