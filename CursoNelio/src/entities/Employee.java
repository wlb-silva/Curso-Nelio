package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double increase;
	
	public double netSalary() {
		return grossSalary-tax;
	}
	public void addSalary(double grossSalary) {
		this.grossSalary*=increase/100;
	}

}
