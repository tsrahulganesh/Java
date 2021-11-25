package Constructors_pack1;

public class staticnonstaticcase {
    //create objects to this class
    //that is datamembers

    int rno;
    String name;
    public static String college;


    //now create non static method

   /* void display() {
        System.out.println("This is method is staticnonstaticcase");
        System.out.println("This is not out");

    }

    void  statevscollege() {
        System.out.println("This is state hous");
       // System.out.println("name =" + "pappu");
        //System.out.println("college=" + "hce");

    }

    void statevscollege2() {
        System.out.println("This is college house");
        //System.out.println("name =" + "pappu");
        //System.out.println("college=" + "hce");
    }

    void display2() {
        System.out.println("This method is non static");

    }
    staticnonstaticcase statevscollege()
    {
               System.out.println("This is wer");
}
    staticnonstaticcase statevscollege2()
    {
        System.out.println("This is wer");
    }

    public static void main(String[] args) {
        staticnonstaticcase.statevscollege = new staticnonstaticcase();
        statevscollege.Registerno = 01;
        statevscollege.name = "postman";
        statevscollege.college = "hce";
        statevscollege.display();
        staticnonstaticcase.statevscollege2 = new staticnonstaticcase();
        statevscollege2.registerno=02;
        statevscollege2.name = "badman";
        statevscollege2.name = "heman";
        statevscollege2.display();

    }

    }*/

    void display() /// non static method 1)
    {
        System.out.println("rno=" + 234);
        System.out.println("name=" + "purpur");
        System.out.println("college=" + "wer");
    }
      void myMethod() ///// static method 2)
    {
        System.out.println("myMethod");
    }
     void staticMethod() // static method 3)  //This is method inside method means method calling inside methode
    {
        System.out.println("inside static method");
          System.out.println("rno="+01); // non static - not allowed
           System.out.println("name="+"pappu"); // non static - not allowed
        System.out.println("college="+"hce"); // static - allowed
          display();// non static - not allowed
        myMethod();// non static - not allowed
        //   staticMethod1();// static - allowed
    }
    static void nonstaticMethod1() // non static method   4)
    {
        System.out.println("staticMethod1");
        System.out.println("rno="+345); // non static -  allowed
        System.out.println("name="+"jaggu"); // non static -  allowed
        System.out.println("college="+"oiu"); // static - allowed
        //display();// non static -  allowed
       // myMethod();// non static -  allowed

    }
    public static void main(String[] args) {

        staticnonstaticcase ob = new staticnonstaticcase();

        ob.staticMethod();
        ob.myMethod();
        ob.nonstaticMethod1();

       // staticnonstaticcase.staticMethod();
        //staticnonstaticcase.myMethod();
        staticnonstaticcase.nonstaticMethod1();

    }
}