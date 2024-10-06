package BitManipulation;

public class oddAndEven {
    public static void oddoreven(int n){
        int bitMask =1;
        if ((n & bitMask) == 0) {
            System.out.println("even Number : ");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddoreven(3);
        oddoreven(4);
        oddoreven(11);
    }
}
