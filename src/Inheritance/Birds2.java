package Inheritance;

public class Birds2 {

Birds2()
{
    System.out.println("Bird constructor");

}
    String colour= "black";

void work()
{
        System.out.println("bird is working");

}


}
class sparrow2 extends Birds2
{
    /*sparrow2()
{
//super()
    System.println("sparrow constructor");
}*/
    String colour = "yellow";

    void work()
    {
        System.out.println("sparrow is working");
    }

    void sparrowmethod1()
    {
        System.out.println(colour);
        System.out.println(super.colour);
        work();
        super.work();

    }


    public static void main(String[] args) {
        sparrow2 s = new sparrow2();
        s.sparrowmethod1();


    }




    }
