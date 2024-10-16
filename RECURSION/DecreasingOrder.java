package RECURSION;

public class DecreasingOrder {
    public static void printDec(int n){
        // Q1: Decreasing Ordre print 1 to n
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        int n =10;
        printDec(n);
    }

    // Print the Number n to 1 (Increasing Order)
    
}
