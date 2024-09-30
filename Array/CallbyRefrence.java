import java.util.*;

// package Array;

public class CallbyRefrence {
    public static void Update(int marks[], int nonChangable){
        nonChangable = 10; // call by refrence nhi Hai 
        for(int i=0; i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
       int marks[] = {97,98,99};

    // In this value not change small concept
      int nonChangable =5; //Change na hone ka karne Array Define nhi hai  

       Update(marks,nonChangable);
       System.out.println("NonChangable : " + nonChangable);
       
    //    print our marks
    for(int i =0; i<marks.length; i++){
        System.out.print(marks[i]+" ");
    }
    System.out.println();
    }
}
 