package Week_11.FirstTask;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class StudentNotFoundException extends Exception
{
    public StudentNotFoundException(String message){
        super(message);
    }
}
class EmptyStudentListException extends RuntimeException{
    public EmptyStudentListException(String message){
        super(message);
    }
}
class Student
{
    private int ID;
    private String name;
    private String university;
    private String department;
    private double GPA;
    public Student(int ID, String name, String university, String department, double GPA){
        this.ID = ID;
        this.name = name;
        this.university = university;
        this.department = department;
        this.GPA = GPA;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return this.GPA;
    }

    public String getDepartment() {
        return department;
    }

    public String getUniversity() {
        return university;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    @Override
    public String toString(){
        return "Name: " + this.name + ", ID:" +this.ID;
    }

}
class StudentSystem
{
    private List <Student> students = new ArrayList<>();
    public List<Student> getStudents(){
        return students;
    }
    public StudentSystem(String fileName)  {

        try{
            BufferedReader reader = new BufferedReader(new FileReader(fileName));


            String line;
            while((line = reader.readLine() ) !=null){
                String[] StudentData = line.split(",");
                int id = Integer.parseInt(StudentData[0].trim());
                String name = StudentData[1].trim();
                String university = StudentData[2].trim();
                String department = StudentData[3].trim();
                double gpa = (int) Double.parseDouble(StudentData[4].trim());
                Student faris = new Student(id,name,university,department, gpa);
                students.add(faris);
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public Optional<Student> getStudentbyID(int ID) throws StudentNotFoundException{
        //if(ID>students.size()) return Optional.ofNullable(null);
        for(Student student : students){
            if(student.getID() == ID) {
                return Optional.of(student);
            }
        }
        throw new StudentNotFoundException("Student not found! ");
    }
    public Student getHighestGPAStudent() {

            Student maxGpaStudent = students.get(0);
            for (Student s : students) {
                if (s.getGPA() > maxGpaStudent.getGPA()) {
                    maxGpaStudent = s;
                }
            }
            return maxGpaStudent;
    }


}
public class Task1 {
    public static void main(String[] args) throws StudentNotFoundException {
        StudentSystem studentSystem = new StudentSystem("C:\\Users\\pc\\Desktop\\IBU\\Second Year\\Object Oriented Programming\\Week11Lab\\students.csv");

        Optional<Student>studentsList =studentSystem.getStudentbyID(1);
        if(studentsList.isPresent()){
            System.out.println(studentsList);
        }
        else {
            throw new StudentNotFoundException("Student not found !");
        }
        System.out.println(studentSystem.getHighestGPAStudent());

    }
}

