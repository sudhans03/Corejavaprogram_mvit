package Utilities;

import Employees.Employee;
import Employees.Manager;
import Employees.Developer;


public class AssignmentMain {

	private static Employee Developer = null;
	private static Employee Manager = null;

	public static void main(String[] args) {

     // Creating instances of Manager and Developer
     Manager manager = new Manager("Sudhan", 1001, 50000, "Sales");
     Developer developer = new Developer("Alice Smith", 1002, 60000, "Java");
     Developer = new Employee("Sudhan", 1000, 90000);
     Manager = new Employee("Alice Smith", 1002, 60000);
     // Creating an array of employees
     Employee[] employees = {Manager, Developer};
     // Using EmployeeUtilities methods
     EmployeeUtilities employeeUtils = new EmployeeUtilities();
     double totalSalary = employeeUtils.calculateTotalSalary(employees);
     System.out.println("Total salary of all employees: " + totalSalary);
 }
}
