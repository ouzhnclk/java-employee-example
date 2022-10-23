package Employee_Example;
import java.util.Scanner; 
public class mainEmployee {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in); 
        System.out.print("Enter Name:");
        String name = inp.nextLine();
        System.out.print("Enter Salary:");
        String salary = inp.nextLine();
        System.out.print("Enter workHours:");
        String workHours = inp.nextLine();
        System.out.print("Enter hireYear:");
        String hireYear = inp.nextLine();
        Employee firstEmployee=new Employee(name, Integer.parseInt(salary), Integer.parseInt(workHours),Integer.parseInt(hireYear));
        firstEmployee.info();
        Employee secondEmployee=new Employee("Hasan",5268,49,2017);
        secondEmployee.info();

    }
}
