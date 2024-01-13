public class Person {
     private String name = "John";

    // Constructors
    public Person() {

    }
    public Person(String name){
        this.name = name;
    }

    // Methods
    void walking() {
        System.out.println("Walking");
    }

    String talking() {
        return "Hello";
    }

    // Getters & setters
    public void set_name(String name) {
        this.name = name;
    }

    String get_name() {
        return name;
    }
    
}
