import java.io.*;
public class EmployeeTest {
	public static void main (String[]args) {
		Employee empOne= new Employee ("James Smith");
		Employee empTwo=new Employee("James Cameron");
		
		empOne.empAge(30);
		empOne.empDesignation("Senior Software Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();
		empTwo.empAge(21);
		empTwo.empDesignation("Software Engineer");
		empTwo.empSalary(500);
		empTwo.printEmployee();
	}

}
