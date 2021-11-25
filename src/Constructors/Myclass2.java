package Constructors;

public class Myclass2 {


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
        //using object we call datamember into the member functions

        public static void main(String[] args) {

        Myclass2 ob = new Myclass2();
        ob.a = 23;
        ob.d = 34.2;
        ob.c = 'c';
        ob.str = "rahul";
        ob.display();

        Myclass2 ob1 = new Myclass2();
        ob1.a = 22435;
        ob1.d = 3423.2;
        ob1.c = 'd';
        ob1.str = "sadfegeg";
        ob1.display();

    }
}


