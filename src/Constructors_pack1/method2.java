package Constructors_pack1;

public class method2 {


      public  int rollno;
        String name;
  public      String college;


      public static void super1() {//non static
            System.out.println("rollno =" + 97097);
            System.out.println("name =" + "basha");
            System.out.println("college=" + "hce");
        }
       public static void display2(){//non static
            System.out.println("rollno =" +345345);
            System.out.println("name ="+"asdkfjh");
            System.out.println("college="+"erg");
        }

   public static      void staticmethod()// 1)
        {
            System.out.println("This is static method");
            super1();
           display2();
        }

          void mymethod() {
            System.out.println("rollno=" + 234234);
            System.out.println("name=" + "hawasss");
            System.out.println("college=" + "hcsdf");
        }
        void mymethod1(){
            System.out.println("This is me");
        }
        void nonstaticmethod() {//2)
            System.out.println("This is non static methode");

            mymethod();
            mymethod1();
            super1();
        }


        public static void main(String[] args) {
            method2 ob = new method2();
            ob.staticmethod();
            ob.nonstaticmethod();

            method2.staticmethod();// getting static method by using class also

        }
    }
/*
Note
Inside static methods,nonstatic members not allowed
we can call staticmethod by calling object aswellas by calling classes.
 */
