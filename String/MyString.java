package String;

import java.util.Scanner;

public class MyString {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Name : ");

      /*  String name1;
        String Name2;
        name1 = sc.next();
        Name2 = sc.nextLine()
        System.out.println(name1 +" + " + Name2 );
        */

        // String ke LengthCount karne ke Liye Hai
       /*  String FullName = "AwadhRaj Patel";
        System.out.println(FullName.length());
        */

        /* 
        // Concatenation Concept
        String firstName ="AwadhRaj";
        String LastName = "Patel";
        String fullName = firstName + " " + LastName;
        System.out.println(fullName);

        */
        // charAt() function

        String firstName ="AwadhRaj";
        String LastName = "Patel";
        String fullName = firstName + " " + LastName;

        printLetters(fullName);
    }
}
