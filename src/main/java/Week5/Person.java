package Week5;
import java.util.List;
import java.util.ArrayList;

public class Person {
    private String name;
    private String address;
    private String country;
    private int age;
    public Person(String name, String address, String country, int age)
    {
        this.name = name;
        this.address = address;
        this.country = country;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString(){
        return name +" " + address + " " +age + " " + country +" ";
    }
    public static void printDepartment(List<Person>people)
    {
        for(Person person : people)
        {
            System.out.println(person.toString());
        }
    }
    public static void main(String[] args)
    {
        Person pekka = new Person("Pekka Mikola", "Korsontie Street 1 03100 Vantaa","BiH",23);
        Person esko = new Person("Esko Ukkonen","Mannerheimintie Street 15 00100 Helsinki","BiH",35);
        System.out.println(pekka);
        System.out.println(esko);
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200,34,"BiH") );
        //*people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki",25,"BiH") );


        printDepartment(people);
    }
}
