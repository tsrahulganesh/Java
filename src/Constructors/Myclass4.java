package Constructors;

public class Myclass4{


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

    Myclass4(int a,double d,char c,
             String str)
    {
        a = a;
        d= d;
        c = c;
        str=str;

    }

    public static void main(String[] args) {

        Myclass4 ob = new Myclass4(343,34.5,'u',"asfwefwe");

        ob.display();

        Myclass4 ob1 = new Myclass4( 3234 ,3434.5,'i',"asrgagagfg");

        ob1.display();

    }
}



