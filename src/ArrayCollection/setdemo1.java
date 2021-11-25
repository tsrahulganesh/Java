package ArrayCollection;
import java.util.HashSet;
import java.util.Set;
public class setdemo1 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(51);
        hs.add(3);
        hs.add(89);
        hs.add(36);
        hs.add(37);
        hs.add(32);

        System.out.println(hs.add(32));
        System.out.println(hs);
    }
}
