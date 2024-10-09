package OOPS;

public class StaticKeyWord {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolNmae ="JVM";

        Student s2 = new Student();
        System.out.println(s2.schoolNmae);
    }
}

class Student {
    String name;
    int roll;

    static String schoolNmae;

    void setName(String name){
        this.name = name;
    }

    String getName(String name){
        return this.name;
    }
}
