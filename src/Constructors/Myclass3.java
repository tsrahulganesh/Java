package Constructors;

public class Myclass3 {


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
    //Empty constructor

    Myclass3()
    {

    }

    public static void main(String[] args) {

        Myclass2 ob = new Myclass2();

        ob.display();

        Myclass2 ob1 = new Myclass2();

        ob1.display();

    }
}


/*Expected
ob1 = all zero
ob2 = all zero*/