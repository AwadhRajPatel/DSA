package OOPS;

public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();

        // Dog dobby = new Dog();
        // dobby.legs =4;
        // System.out.println(dobby.legs);
    }
}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

//Hierarchial Inheritance
class Mammal extends Animal{
    void walk(){
        System.out.println("walk");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("swim");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}

/* 
// Multi Level Inheritance
class Mammal extends Animal{
    int legs;
}

class Dog extends Mammal{ 
    String breed;
}
 */
//

// Derived class  Inheritance kiya gya function hai  fish
/* 
class Fish extends Animal{

    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}
*/