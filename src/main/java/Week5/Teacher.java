package Week5;

public class Teacher extends Person{
    private int salary;
    public Teacher(String name, String address, int salary, int age, String country)
    {
        super(name, address,country,age);
        this.salary = salary;
    }

    public String toString()
    {
        return super.toString() + salary;
    }
    public static void main(String[] args)
    {
        Teacher pekka = new Teacher("Pekka Mikkola\n", " Korsontie Street 1 03100 Vantaa\n ", 1200,23,"BiH");
        Teacher esko = new Teacher("Esko Ukkonen\n", " Mannerheimintie 15 Street 00100 Helsinki\n ", 5400,34,"BiH");
        System.out.println(pekka);
        System.out.println(esko);
        //*Student oli = new Student("Olli\n", " Ida Albergintie 1 Street 00400 Helsinki",29,"BiH");
        /*for(int i = 0; i< 25; i++){
            oli.study();
        }
        System.out.println(oli);
        System.out.println(" credits "+oli.credits()); */
    }
}
