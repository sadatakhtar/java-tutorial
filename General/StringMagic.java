package General;
public class StringMagic {




    public static void main(String[] args){
        // System.out.println(countUpperCaseLetters("HellO WORld"));
        //System.out.println(hasConsecutiveDuplicates("helow"));
        int[] marks = {10, 20, 50, 23};

        for(int i =0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }


    // Methods
    public static int countUpperCaseLetters(String str){       
        int counter = 0;
        if(str == null){
            return -1;
        }
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(((str.charAt(i))))){
                counter += 1;
            }
        }
        return counter;  
    }

  
    public static boolean hasConsecutiveDuplicates(String str){
        
        if(str == null || str == ""){
            return false;
        }

        for(int i= 0; i<str.length() -1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                return true;
            } 

        }
        return false;
    }
}
