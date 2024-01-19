package AbstractClass;

public class Recipe extends AbstractRecipe{
    public void getReady() {
        System.out.println("Prepare the ingredients");
    }

    public void doTheDish(){
        System.out.println("Cook the dish");
    }
    
    public void cleanup(){
        System.out.println("Clean the utensils");
    }
}
