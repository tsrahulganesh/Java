package Inheritance;

public interface Interfacedemo2 {
    //here we see the how to use the multiple inheritance using interface
    abstract void start();

    abstract void run();

    void display();


    interface anotherinterface {
        void display();
    }

    //Note:As you see in abstract and interface we need to implement parent method in child as well.
    class childInterface1 implements Interfacedemo2, anotherinterface {
        public void start() {
            System.out.println("start");
        }

        public void run() {
            System.out.println("run");

        }

        public void display() {
            System.out.println("display");

        }

        public static void main(String[] args) {

            //Interfacedemo2 ob = new childInterface1() {
            // ob.start();
            // ob.run();
            //ob.display();
            // }
        }
    }
}









