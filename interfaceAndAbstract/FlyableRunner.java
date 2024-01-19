package interfaceAndAbstract;

public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Plane()};

        for(Flyable object : flyingObjects){
            object.fly();
        }

        for(int i=0; i< flyingObjects.length; i++){
            flyingObjects[i].fly();
        }
    }
    
}
