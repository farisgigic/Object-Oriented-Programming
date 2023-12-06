package Week7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
record Employee(int id, String name, double salary) {}
class EmployeeManagementSystem {

    public static List<Employee> filterEmployeeBySalary (List<Employee> employeeList, double salary) {
        return employeeList.stream().filter(employee -> employee.salary() >= salary).toList();
    }

    public static double calculateTotalSalary(List<Employee> employeeList) {
        double sum = 0;
        for(Employee e : employeeList) {
            sum+= e.salary();
        }
        return sum;
    }

    public static void displayEmployeeDetails(List<Employee> employeeList) {
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
public class Third {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "Emir", 100000),
                new Employee(2, "Amar", 50.5),
                new Employee(3, "Faris", 520.3),
                new Employee(4, "Haris", 3.1)
        ));

        List<Employee> filteredBySalary = EmployeeManagementSystem.filterEmployeeBySalary(employeeList, 500);
        for(Employee e : filteredBySalary) {
            System.out.println(e);
        }

        double totalSalary = EmployeeManagementSystem.calculateTotalSalary(employeeList);
        System.out.println(String.format("%.2f", totalSalary));

        EmployeeManagementSystem.displayEmployeeDetails(employeeList);
    }
}
