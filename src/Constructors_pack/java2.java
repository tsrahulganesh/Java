package Constructors_pack;

public class java2 {

    //data members
  int a1;
     double d1;
     char c1;
    String str1;


//member function

    void display()
    {
        System.out.println("a=" + a1);
        System.out.println("d=" + d1);
        System.out.println("c=" + c1);
        System.out.println("str=" +str1);
    }


    public static void main(String[] args) {
        java1 ob = new java1();
        ob.a =10;
        //ob.d= 85.4;
        ob.c ='j';
        ob.str="rwer";
        ob.display();


    }
}



