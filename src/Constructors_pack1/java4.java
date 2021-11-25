package Constructors_pack1;
import Constructors_pack.java1;
public class java4 {
    int a4;
    double d4;
    char c4;
    String str4;


    void display() {
        System.out.println("a=" + a4);
        System.out.println("d=" + d4);
        System.out.println("c=" + c4);
        System.out.println("str=" + str4);
    }


    public static void main(String[] args) {
        java1 ob = new java1();
        ob.a = 10;
        //ob.d = 85.4;
        ob.display();


        java4 ob4 = new java4();
        ob4.c4 ='l';
        ob4.display();
    }
}