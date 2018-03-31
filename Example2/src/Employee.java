import java.io.*;
public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	

	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	

	public void empDesignation(String empdesignation) {
		// TODO Auto-generated method stub
		designation=empdesignation;
	}

	public void empAge(int empAge) {
		// TODO Auto-generated method stub
		age=empAge;
		
	}

	public void empSalary(double empsalary) {
		// TODO Auto-generated method stub
		salary=empsalary;
	}

	public void printEmployee() {
		// TODO Auto-generated method stub
	
		System.out.println("Name:" + name + ",");
		System.out.println("Age:" + age + ",");
		System.out.println("Designation:" + designation + ",");
		System.out.println("Salary:" + salary + ",");
	}
}
