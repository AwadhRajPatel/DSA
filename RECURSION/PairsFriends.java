package RECURSION;

public class PairsFriends {

    public static int Friendspairs(int n){
        // base-case
        if (n == 1 || n == 2) {
            return n;
        }
        /* 
        // choice
        // single
        int fnm1 = Friendspairs(n-1);
        // pairs
        int fnm2 = Friendspairs(n-2);
        int pairsways = (n-1) * fnm2;
        // toways
        int toways = fnm1 + pairsways;
        return toways;
        */
        return Friendspairs(n-1) + (n-1) * Friendspairs(n-2);
    }
    public static void main(String[] args) {
       System.out.println(Friendspairs(3));
    }
}
