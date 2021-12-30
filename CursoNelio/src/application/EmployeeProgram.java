package application;
import java.util.Scanner;

import entities.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Enter name employee: ");
		employee.name=sc.nextLine();
		System.out.println("Gross Salary: ");
		employee.grossSalary=sc.nextDouble();
		System.out.println("Tax");
		employee.tax=sc.nextDouble();
		System.out.println("Increase");
		employee.increase=sc.nextDouble();
		
		System.out.println();
		System.out.println(employee);
		
	}

}
