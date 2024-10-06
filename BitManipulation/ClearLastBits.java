package BitManipulation;

public class ClearLastBits {
    public static int clearIBits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }

    public static int clearBitsRange(int n, int i, int j){
        int a =((~0)<<(j+1));
        int b =(1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearIBits(15, 2));
        System.out.println(clearBitsRange(10, 02, 04));
    }
}
  