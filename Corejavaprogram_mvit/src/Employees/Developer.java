package Employees;

public class Developer {

 private String programmingLanguage;

 public Developer(String name, int employeeId, double salary, String programmingLanguage) {
     super();
     this.programmingLanguage = programmingLanguage;
 }

 public String getProgrammingLanguage() {
     return programmingLanguage;
 }

 public void setProgrammingLanguage(String programmingLanguage) {
     this.programmingLanguage = programmingLanguage;
 }
}

