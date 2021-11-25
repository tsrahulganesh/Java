package Constructors_pack;

public class java1 {


    //data members
    public int a;
    private double d;
    protected char c;
    public String str;


//member function

   public void display()
    {
        System.out.println("a=" + a);
        System.out.println("d=" + d);
        System.out.println("c=" + c);
        System.out.println("str=" +str);
    }


    public static void main(String[] args) {
        java1 ob = new java1();
        ob.a =10;
        ob.d= 85.4;
        ob.c ='j';
        ob.str="rwer";
        ob.display() ;


    }
}



