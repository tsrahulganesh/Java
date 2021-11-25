package Constructors_pack1;

public class method {

    int rollno;
    String name;
    String college;


    void display() {
        System.out.println("rollno =" + 97097);
        System.out.println("name =" + "basha");
        System.out.println("college=" + "hce");
    }
        void display2(){
            System.out.println("rollno =" +345345);
            System.out.println("name ="+"asdkfjh");
            System.out.println("college="+"erg");
        }

void staticmethod()// 1)
{
    System.out.println("This is static method");
    display();
    display2();
}



    public static void main(String[] args) {
        method ob = new method();
        ob.staticmethod();

    }
}
