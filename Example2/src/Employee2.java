import java.util.*;

public class Employee2 {
	public String name;
	private double salary;

	public Employee2(String empName) {
		name = empName;
	}

	public void setSalary(double empSalary) {
		salary = empSalary;
	}

	public void printEmp() {
		System.out.println("name = " + name);
		System.out.println("salary = " + salary);

	}

	public static void main(String[] args) {
		Employee2 employee = new Employee2("Faysal");
		employee.setSalary(1000);
		employee.printEmp();
	}
}
