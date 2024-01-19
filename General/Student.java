package General;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {
    private String name;
    private int[] marks;

    // Constructors
    public Student() {

    }

    public Student(String name, int... marks) {
        this.name = name;
        this.marks = marks;
    }

    // Methods
    public int getTotalSumOfMarks() {
        int totalMarks = 0;
        for(int mark:marks){
            totalMarks += mark;
        }
        return totalMarks;
    }

    public int getNumberOfMarks() {
        return marks.length;
    }
    
    public int getMaxMark(){
      int maxMark = findMax(marks);
      return maxMark;
    }

      public int getMinMark(){
        int minMark = findMin(marks);
        return minMark; 
    }

    public BigDecimal getAverage(){
        int totalMarks = getTotalSumOfMarks();
        int length =  getNumberOfMarks();
        return new BigDecimal(totalMarks).divide(new BigDecimal(length), 3, RoundingMode.UP);
    }

    public static int findMax(int[] arr){
        if(arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }

        int max = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

     public static int findMin(int[] arr){
        if(arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }

        int min = Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


    
}
