import java.util.*;

// package Array;


public class InputjOutput2 {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        //  int phy
        // phy = sc.nextInt();
        
        // Array ki length pta kare ke liye
        System.out.println("length of array = " + marks.length);
        System.out.println("Enter Your Marks");

        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //math 

        System.out.println("PHY : " + marks[0]);
        System.out.println("CHEM : " + marks[1]);
        System.out.println("Math : " + marks[2]);
        
        // Update value
        marks[2] = 100;
        System.out.println("Math : " + marks[2]);

        // Calculate percents
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("Percentage = " + percentage + "%");
    }
      
}
