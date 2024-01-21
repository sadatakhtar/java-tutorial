package Lists;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(List.of("Apple", "Bat", "Cat"));

      
        System.out.println(words.get(1));
        System.out.println(words.indexOf("Cat"));
        System.out.println(words.size());
        System.out.println(words.contains("Horse"));
        words.add("Horse");
        System.out.println(words.contains("Horse"));

        for(String word: words){
            System.out.println(word);
        }


    
    }
}
