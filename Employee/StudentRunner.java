package Employee;

public class StudentRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Mr", "Capgemini", 4, 39.5);
        employee.setName("Sadat");
        employee.setEmail("sadat@gmail.com");
        employee.setPhoneNumber("123-456-789");

        System.out.println(employee);

    }
}
