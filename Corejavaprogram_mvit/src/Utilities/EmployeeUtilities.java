package Utilities;

import Employees.Employee;

public class EmployeeUtilities {

public double calculateTotalSalary(Employee[] employees) {
       double totalSalary = 0;
       for (Employee employee : employees) {
       totalSalary += employee.getSalary();
      }
    return totalSalary;
  }
}

