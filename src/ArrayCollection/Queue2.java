package ArrayCollection;
import java.util.ArrayDeque;
public class Queue2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(67);
        adq.offer(34);
        adq.offer(45);
        adq.offer(454);
        adq.offer(34);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(500);
        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);
    }
}
