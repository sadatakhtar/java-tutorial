package AbstractClass;

public class RecipeWithMicrowave extends AbstractRecipe{

    public void getReady(){
        System.out.println("Find the raw materials");
    }

    public void doTheDish(){
        System.out.println("Switch on microwave");
        System.out.println("Cook the dish in the microwave");
    }
    
    public void cleanup(){
        System.out.println("Switch off microwave");
        System.out.println("Wash the dishes");
    }
}


    
