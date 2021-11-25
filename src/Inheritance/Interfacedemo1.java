package Inheritance;

public interface Interfacedemo1
{
    default void display1(){
        System.out.println("display1");
    }
    static  void display2(){
        System.out.println("display2");
    }
    private void display3(){
        System.out.println("display3");
    }
          void start();
    void run();

    class childInterface implements Interfacedemo1 {
       public void start(){
            System.out.println("start");
        }
       public void run(){
            System.out.println("run");
        }
    }

        public static void main(String[] args) {
            Interfacedemo1 ob = new childInterface();
            ob.start();
            ob.display1();
            Interfacedemo1.display2();// because of calling static memeber
            ob.display3();
            ob.run();
        }

}
