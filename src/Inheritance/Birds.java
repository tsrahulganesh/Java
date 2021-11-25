package Inheritance;

public class Birds {
    void fly() {
        System.out.println("fly");
    }
}
class crow extends Birds {
    void crowcolour() {
        System.out.println("crowcolour");
        System.out.println("fly");

    }
}
    class sparrow1 extends Birds {
    void sparrowcolour()
    {
        System.out.println("sparrowcolour");
        System.out.println("fly");
    }


    public static void main(String[] args) {
        Birds a = new Birds();
        a.fly();
        crow b = new crow();
        b.crowcolour();
        a.fly();
        sparrow1 c = new sparrow1();
        c.sparrowcolour();
        a.fly();
    }

}
