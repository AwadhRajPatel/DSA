package RECURSION;

public class TilingProblem {
    public static int  tilingProblem(int n){
        // base-case
        if (n==0 || n==1) {
            return 1;
        }
        // Kaam
        // Vertical Choice
        int VerticalTiles = tilingProblem(n-1);

        // Horizantally Choice
        int HorizantallyTiles = tilingProblem(n-2);

        int toways = VerticalTiles + HorizantallyTiles;
        return toways;

    }  

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
}
