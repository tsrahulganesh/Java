package Inheritance;

public class birdbird {

    String colour= "black";
    void birdbird()
    {
        System.out.println(colour);
    }


}
class sparrow extends birdbird {
    String colour = "yellow";

    void sparrowmethod() {
        System.out.println(colour);

    }


    public static void main(String[] args) {
        sparrow s = new sparrow();
        s.sparrowmethod();


        birdbird b=new birdbird();
        s.birdbird();
        s.sparrowmethod();




    }
}