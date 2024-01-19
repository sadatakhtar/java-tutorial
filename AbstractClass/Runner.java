package AbstractClass;

public class Runner {
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.bark();
        Recipe recipe = new Recipe();
        RecipeWithMicrowave rec2 = new RecipeWithMicrowave();


        recipe.execute();
        rec2.execute(); 
    }
}
