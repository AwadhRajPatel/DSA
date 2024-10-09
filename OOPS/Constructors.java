package OOPS;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student("Awadh-Raj Ptel");
        System.out.println(s1.name);
    }
}


 class Student {
    String name; 
    int roll;
    
    Student(String name){   // Constructor create kiya gya hai
        this.name = name;
    }
}
