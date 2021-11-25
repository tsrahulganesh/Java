package Inheritance;

public abstract class Abssession {
//Abstract is special access modifier ,here instead class we need to say as Abstract

    //for class we create
    //Data members
    //member function
    //main program
    //condition
    //like wise in class we use abstract and this will be parent class and child will be defined as
    // INTERFACE,now parent child  - here will be Abstract - Interface.

    //void start();
    //Error is due to class abstract in main program
    //so it should be
    abstract void start();
    abstract void run();
   void display() {
        System.out.println("display");
    }

    /*void start() {
        System.out.println("start");
    }

    void run() {
        System.out.println("run");

    }*/

    static class child extends Abssession {  //here if you see without the class abstract it was showing error
//in abstract when parent is abstract , child also should be abstract

        void start() {
            System.out.println("start");
        }

        void run() {
            System.out.println("run");

        }
    }

    public static void main(String[] args) {
        Abssession ob = new child();


        ob.run();
        ob.start();
        ob.display();


        }
    }





