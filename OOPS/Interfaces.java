package OOPS;

public class Interfaces {
    public static void main(String[] args) {
        Queen q = new  Queen();
        q.moves();
    }
}


interface  ChessPlayer {
    void moves(); 
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal,(in all 4 Dirns)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}


class Kng implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right,diagonal-(by 1 step)");
    }
}
