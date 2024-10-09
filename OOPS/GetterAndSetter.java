package OOPS;

public class GetterAndSetter {
    public static void main(String[] args) {

        Pen p1 = new Pen(); // create a apen objects called p1
        
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("yellow");
        System.out.println(p1.getColor());

    }
}

class Pen {

    private String color;
    private int tip;

    String getColor() { // Getters
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) { // Setters
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

}