package Constructors;

public class Myclass6{


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

    Myclass6(int a,double d,char c,
             String str)
    {
       this.a = a;
        this.d= d;
        this.c = c;
        this.str=str;

    }

    public static void main(String[] args) {

        Myclass6 ob = new Myclass6(343,34.5,'u',"asfwefwe");

        ob.display();

        Myclass6 ob1 = new Myclass6( 3234 ,3434.5,'i',"asrgagagfg");

        ob1.display();

    }
}



