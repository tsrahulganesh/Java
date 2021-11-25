package Constructors_pack;
//import Constructors_pack.java3;
/*when ever method returns a value
1.last line of that method should be return followed by value or variable   holding a value;with the same type
2.The method actually holds the value it returns.*/

public class Returntypemethod {
    int obj() {
        return 10;
        //method should end with return type or it should hold its value
    }

    int obj2() {
        int x = 90;
        return x;
//or method should hold the value inside the variable while exit
    }
    //class ob =new ob

    double obj3() {
        return 987.9870;
        //method should end with return type or it should hold its value
    }

     double obj4() {
         double x = 90.0452435;
         return x;
     }

    char obj5() {
        return 'j';
        //method should end with return type or it should hold its value
    }

    char obj6() {
        char x = 'K';
        return x;
    }
    String obj7() {
        return "rahul1";
        //method should end with return type or it should hold its value
    }

    String obj8() {
        String x = "mama";
        return x;
    }

    int[] obj9(){
        int[] x = {23,34,545,565,455,};
                return x;
    }
    String[][] obj10(){
        String [][] x = {
                {"asdf","asdf","wer0"},
                {"asd1","asd1","wer1"},
                {"asd2","asd2","wer2"},
                {"asd3","asd3","wer3"}
        };
        return x;
    }
    /*java3 obj11(){
        java3 jj = new java3();
        jj.a3=12;
        jj.d3 = 9.8;
        jj.c3 = 'g';
        jj.str3 = "amol";
        return  jj;*/


    public static void main(String[] args){
             Returntypemethod ob11 = new Returntypemethod();
             int xx = ob11.obj();
             int aa = ob11.obj2();
             double yy = ob11.obj3();
             double bb = ob11.obj4();
             char zz = ob11.obj5();
             char cc = ob11.obj6();
             String HH = ob11.obj7();
             String dd = ob11.obj8();
             /*java3 jj =ob11.obj11();
             jj.display();*/

             int[] ee  = ob11.obj9();
             for(int i=0;i<ee.length;i++)
            System.out.print(ee[i]);
            System.out.println();

            String[][] ff   =ob11.obj10();
            for(int i=0;i<ff.length;i++) {
                for (int j = 0;j<ff[0].length;j++)
                {
                    System.out.print(ff[i][j] + " ");
                }
                System.out.println();
            }

             System.out.println("xx=" + xx);
             System.out.println("aa=" + aa);
             System.out.println("yy=" + yy);
             System.out.println("bb=" + bb);
             System.out.println("zz="+zz);
             System.out.println("cc="+cc);
             System.out.println("HH="+HH);
             System.out.println("dd="+dd);



         }


         }

