package problem5;
import java.util.*;
public class Main {
public static void main(String[] args) {
	 getEmployeeDetails() ;
	 
}

public static Employee getEmployeeDetails() {
	Scanner sc = new Scanner(System.in) ;
	System.out.println("Question number 5 Answer");
	System.out.println("======================\n");
	
	System.out.println("Enter Id:");
	int id = sc.nextInt() ;
	System.out.println("Enter Name: ");
	String name = sc.next() ;
	System.out.println("Enter Salary: ");
	double sal = sc.nextDouble() ;
	System.out.println("Enter PF percentage: ");
	int pf = sc.nextInt() ;
	
	Employee employee = new Employee() ;
	
	employee.setEmployeeId(id);
	employee.setEmployeeName(name);
	employee.setSalary(sal);
	employee.calculateNetSalary(pf);
	
	System.out.println("Id : "+employee.getEmployeeId());
	System.out.println("Name : "+employee.getEmployeeName());
	System.out.println("Salary : "+employee.getSalary());
	System.out.println("Net Salary : "+employee.getNetSalary());
	
	
	return new Employee() ;
}
}
