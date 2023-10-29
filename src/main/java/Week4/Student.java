package Week4;

public class Student extends Person
{
    private int credit;
    private int studenId;
    private GradesForStudentClass grade;
    public Student(String name, String address, int age, String country, int studenId, GradesForStudentClass grade)
    {
        super(name,address,country,age);
        this.grade = grade;
        this.grade = grade;

        this.credit = 0;

    }
    public int credits(){

        return this.credit;
    }
    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public int getStudenId() {
        return studenId;
    }

    public void setStudenId(int studenId) {
        this.studenId = studenId;
    }

    public GradesForStudentClass getGrade() {
        return grade;
    }

    public void setGrade(GradesForStudentClass grade) {
        this.grade = grade;
    }

    public void study()
    {
        this.credit++;
    }
public static void main(String[] args)
    {
        Student oli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki",45,"BiH",223,GradesForStudentClass.C);
        System.out.println(oli);
        System.out.println("credits "+oli.credits());
        oli.study();
        System.out.print("credits "+oli.credits());
    }
}
