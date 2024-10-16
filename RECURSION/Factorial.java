package RECURSION;

public class Factorial {
    // factorial
    /* 
    public static int fact(int n){
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }
 */

   //  Q 3:  Print Sum of first N Natural Numbers. 
    /* 
    public static int calcSum(int n){
        if (n==1) {
            return 1;
        }
        int Snm1 = calcSum(n-1);
        int Sn = n + Snm1;
        return Sn;
    }
    */

    // Q 4 Calculate n-th  term in fibonacci series;
   /*
    public static int fib(int n){
        if(n ==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    */

    //Q 5: Check if a given array is sorted or not
    public static boolean isSorted(int arr[], int i){
        if (i == arr.length-1) {
            return true;
        } 

        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
 
    //  Q 6 WAF to find the  first Occurence of an element in an array

    public static int firstOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurence(arr,  key, i+1);
    }

    // Q 7 WAF to find the  Last Occurence of an element in an array
    public static int LastOccurence(int arr[], int key, int i){
        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccurence(arr,key,i+1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    } 

    //    Q 8 print the X power n (x^n) 
    public static int power(int x, int n){
        if (n==0) {
            return 1;
        }

        // int Xnm1 = power(x, n-1);
        // int Xn = x * Xnm1;
        // return Xn;

        return x * power(x, n-1);
    }

    // Q 10 power of x to n (x^n) optimized code
    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 !=0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }
    //
     public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimizedPower(a, n));

        //  System.out.println(power(2, 10));

        // int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(LastOccurence(arr,5,0));

        //   int arr[] = {8,3,6,9,5,10,2,5,3};
        // System.out.println(firstOccurence(arr, 5, 0));

        // int arr[] = {1,2,3,4,5};
        // System.out.println(isSorted(arr, 0));

        // int n = 5;
        // System.out.println(fact(n));
        // System.out.println(calcSum(n));
        // System.out.println(fib(n));
          
    }
}
    