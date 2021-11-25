package ArrayCollection;
import java.util.PriorityQueue;
public class Queue1 {

    public static void main(String[]args){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
        pq.offer(34);
        pq.offer(45);
        pq.offer(978);
        pq.offer(34);
        System.out.println(pq);

        // some operating systems doesnot suppport priority queue
        // so sometimes we may not see the proper sorted output
        // but internally it is sorted
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }

}
