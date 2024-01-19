package General;
import java.math.BigDecimal;

public class StudentRunner {

    static int[] topStudentMarks = { 97,98,100};
    public static void main(String[] args){
        Student topStudent = new Student("Harry", 1,5,8 );
        Student student2 = new Student("Ron", 23, 67, 56, 99);



        int numberOfMarks = topStudent.getNumberOfMarks();
        int sum = topStudent.getTotalSumOfMarks();
        int maxMark = topStudent.getMaxMark();
        int minMark = topStudent.getMinMark();
        BigDecimal average = topStudent.getAverage();

        int sumOfRonsMarks = student2.getTotalSumOfMarks();
        int ronsTopMark = student2.getMaxMark();

        System.out.println("Number of marks : " + numberOfMarks);
        System.out.println("Total sum of marks : "+sum);
        System.out.println("Maximum mark : "+maxMark);
        System.out.println("Minimum mark : " +minMark);
        System.out.println("Average mark : " +average);


        System.out.println("Sum of Rons marks : " + sumOfRonsMarks);
         System.out.println("Rons top mark : " + ronsTopMark);
    }
    
}
