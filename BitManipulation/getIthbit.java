package BitManipulation;

public class getIthbit {
    public static int GetIthBit(int n, int i){
        int bitMask = i<<i;
        if ((n& bitMask) == 0) {
            return 0;
        }else{
            return 1;
        }
    }

    public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int ClearIthBit(int n, int i){
    int bitMask = ~(1<<i);
    return n & bitMask;
    }

    public static int UpdateIthBit(int n, int i,int newBit){
        // if (newBit ==0) {
        //    return ClearIthBit(n,1); 
        //  }else{
        //     return SetIthBit(n ,i);
        // }
        n = ClearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(GetIthBit(10 ,2));
        System.out.println(SetIthBit(10, 2));
        System.out.println(ClearIthBit(10, 1));
        System.out.println(UpdateIthBit(10, 2, 1));
        // BitManipulation
    }
} 
