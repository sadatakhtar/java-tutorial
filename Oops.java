import java.util.ArrayList;
import java.util.List;

public class Oops {

    public static void main(String[] args){
        //System.out.println("Hello world");

        //User x = new User("Hagrid", "Bronze");

        //User z = x;
        //User z = new User();
        //z.set_membership(User.Membership.Bronze);

        // System.out.println(x.get_name());
        // System.out.println(x.get_membership());
        // System.out.println(z.get_name());
        // System.out.println(z.get_membership());
        //System.out.println(x.equals(z));
        //System.out.println(z);

        List<User> users = new ArrayList<User>();
        users.add(new User("Arnie"));
        users.add(new User("Henry"));
        users.add(new User("Ronn"));

        // forloop - 1
        for(int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).get_name());
        }

        for(User u : users){
            System.out.println(u.get_name() + " v2");
        }
    }
}