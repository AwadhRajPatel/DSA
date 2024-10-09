package OOPS;

public class PracticeQuestion {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "AwadhRaj";
        System.out.println(s.name);
    }
}


class Student{
    String name;
    int mark;
}

class Person{
    String name;
    int weight;
}

class Students extends Person {
    int rollNumber;
    String schoolNmae;
}