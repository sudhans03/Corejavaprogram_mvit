package Employees;

public class Manager {

	private String department;
	private double salary;
	public String name;
	public int employeeId;
	
	 public Manager(String name, int employeeId, double salary, String department) {
	     super();
	     this.department = department;
	     this.salary = salary;
	     this.name = name;
	     this.employeeId = employeeId;
	 }

	 public String getDepasrtment() {
	     return department;
	 }

	 public void setDepartment(String department) {
	     this.department = department;
	 }
	 public double getSalary() {
		 return salary;
	 }
	}






 
