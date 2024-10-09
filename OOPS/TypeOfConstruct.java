package OOPS;

public class TypeOfConstruct {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "AwadhRaj";
        s1.roll =1254;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password ="xyz";
        s1.marks[2] =100;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        } 

        // Student s2 = new Student("Awadhraj");
        // Student s3 = new Student(12345);


    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // Copy  Constructors  and Shallow copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll =s1.roll;
    //     this.marks = s1.marks;
    // }

    
    //Deep copy  Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll; 
        for(int i =0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    /**/
      // Non Parameterized
      Student(){
        marks = new int[3];
        System.out.println("Constructor is called...");
      }
     
    // Parameterrized
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }


}
