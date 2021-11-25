package Constructors;

public class Myclass5{


    //data members
    int a;
    double d;
    char c;
    String str;


//member function

    void display()
    {
        System.out.println("a=" + a);
        System.out.println("d=" + d);
        System.out.println("c=" + c);
        System.out.println("str=" +str);
    }
    //now give value in empty constructor

    Myclass5()
    {
a =10;
d= 85.4;
c ='j';
str="rwer";

    }

    public static void main(String[] args) {

        Myclass5 ob = new Myclass5();

        ob.display();

        Myclass5 ob1 = new Myclass5();

        ob1.display();

    }
}



