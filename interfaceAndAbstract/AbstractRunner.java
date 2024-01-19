package interfaceAndAbstract;

public class AbstractRunner {
    public static void main(String[] args) {
        AbstractAnimal[] animals = {new Dog(), new Cat()};

        for(AbstractAnimal animal: animals){
            animal.bark();
        }
    }
}
