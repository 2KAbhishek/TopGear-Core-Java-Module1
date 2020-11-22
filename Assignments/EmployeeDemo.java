import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID Number: ");
        int id = sc.nextInt();
        System.out.print("Enter Years of Experience: ");
        int years = sc.nextInt();
        System.out.print("Enter Annual Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(salary, years, id, name);
        System.out.println("Employee's Name: " + emp.getName());
        System.out.println("Employee's ID " + emp.getId());
        System.out.println("Employee's Salary: " + emp.getSalary());
        System.out.println("Years Of Experience: " + emp.getYears());
    }

}
