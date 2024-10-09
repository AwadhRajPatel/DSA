package OOPS;

public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk(); 
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
    }
}

abstract class Animal {
    String color;

    Animal(){
        color = "Brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}

//  Sub class create kiya gya hai
class Horse extends Animal{
    void changeColor(){
        color = "Dark brown";
    }

    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color = "WhiteColor";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
