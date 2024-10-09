package OOPS;

public class ClassAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        BankAccount myAcc = new BankAccount();
        myAcc.username = "AwadhRajpatel";
        myAcc.setPassword("abcdefghi");
    }
}

class BankAccount{
    public String username;
    private String password;
    
    public void setPassword(String pwd){
        password = pwd;
    }

}

//


class Pen {    // objects
    String color;
     int tip;

     void setColor(String newColor){
        color = newColor;
     }

     void setTip(int newTip){
      tip = newTip;
     }
}

class Student{

    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage =(phy + chem + math) /3;
    }
}

// java ClassAndObjects.java