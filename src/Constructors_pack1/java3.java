package Constructors_pack1;

import Constructors_pack.java1;

public class java3 {


   public int a3;
    public double d3;
    public char c3;
    public String str3;


    void display3() {
        System.out.println("a= "+a3);
        System.out.println("d= "+d3);
        System.out.println("c= "+c3);
        System.out.println("a= "+str3);

    }


    public static void main(String[] args) {
        java1 ob = new java1();
        ob.a=10;
        ob.str="rewr";
        ob.display();



        java3 ob3 = new java3();
        ob3.c3 ='a';
        ob3.display3();



    }
}
