package General;
public class BlockExample {
    static {
        System.out.println("This is a static block - it runs when the class is loaded.");
    }

    // Triggers before constructor
    {
        System.out.println("This is a non static block - it runs before any constructor");
    }

    // Constructor
    public BlockExample() {
        System.out.println("Constructor called - runs when object is created");
    }

    public static void main(String[] args) {
        System.out.println("Main method starting....");
        BlockExample obj1 = new BlockExample();
        BlockExample obj2 = new BlockExample();
    }
    
}
