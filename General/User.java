package General;
public class User {
    private String name = "Harry";
    private String membership = "Gold";

    public String toString() {
        return get_name() + " " + get_membership();
    }

    public boolean equals(User z){
        if(get_name() == z.get_name() && get_membership() == z.get_membership()){
            return true;
        } else {
            return false;
        }

    }
    // Constructors
    public User() {

    }

    public User(String name){
        set_name(name);
    }
    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }

    // Setters & getters
    void set_name(String name) {
        this.name = name;
    }

    String get_name() {
        return this.name;
    }

    void set_membership(String membership){
        this.membership = membership;
    }

    // Setter with enums
    void set_membership(Membership membership){
        this.membership = membership.name();
    }

    public enum Membership {
        Bronze, Silver, Gold;
    }

    String get_membership() {
        return this.membership;
    }
}
