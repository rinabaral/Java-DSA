import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> pq = new PriorityQueue<>();
        //adding elements in queue
        pq.add("Hey");
        pq.add("I am ");
        pq.add("Fine");
        System.out.println(pq);

        //removing head from the queue
        System.out.println(pq.poll());
        System.out.println(pq);

        //iterating through queue
        Iterator itr = pq.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
