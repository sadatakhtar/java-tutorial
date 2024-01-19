package Employee;

import Person.Person;

public class Employee extends Person{
    private String title;
    private String employer;
    private int employeeGrade;
    private double salary;

    public Employee(String title, String employer, int employeeGrade, double salary){
      
        this.title = title;
        this.employer = employer;
        this.employeeGrade = employeeGrade;
        this.salary = salary;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public int getEmployeeGrade() {
        return employeeGrade;
    }

    public void setEmployeeGrade(int employeeGrade) {
        this.employeeGrade = employeeGrade;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    //toString
    public String toString(){
        return super.toString() + String.format(" Title - [%s], employer - [%s], Grade - [%d]",
        title, employer, employeeGrade);
    }
}
