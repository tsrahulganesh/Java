package ArrayCollection;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class set2 {

    public static void main(String[] args) {
        LinkedHashSet<Integer> hsd = new LinkedHashSet<>();
        hsd.add(89);
        hsd.add(22);
        hsd.add(233);
        hsd.add(9823);
        hsd.add(2353);
        hsd.add(39);

        System.out.println(hsd.add(232323));
       System.out.println(hsd.add(39));
        System.out.println(hsd);
    }

}
