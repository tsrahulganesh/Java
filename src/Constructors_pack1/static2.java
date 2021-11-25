package Constructors_pack1;

public class static2
{
   static int count= 1;// here i m creating object

    static2()
    {
        count++;// here when ever i creat object there will be default constructors created
    System.out.println(count);
    }


    public static void main(String[] args) {
        static2 c1 =new static2();//2
        static2 c2 = new static2();//2
        static2 c3 = new static2();//2
    }
}
/* we see that when we use static class at data member ,result changed to
2,3,4
before static it was 2,2,2
its because when we say int is static that means that it is common datamember for all the variabls
like c1 c2 c3
previously for c1 it was looking for int as saparate space for each that is why the cycle started everytime from 1.
hence count ++ it is 1 + 1 = 2 for c1 and c2 and c3.
 */