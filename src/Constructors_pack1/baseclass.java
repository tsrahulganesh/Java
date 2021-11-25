package Constructors_pack1;

public class baseclass {
    public class base {

        void method() {
            System.out.println("this is my method");
        }
    }
}

    class child extends baseclass {

        void method() {
            System.out.println("this is my child");
        }

        public static void main(String[] args) {
            //staticMethod.staticMethod();
        }
    }

/*variable  - we cant change
  method  - we cant over ride it
  class   - we cant subclass it
  Hence if we do final we cant change variable,we cant override it,we cant make either base or child as final

 */







