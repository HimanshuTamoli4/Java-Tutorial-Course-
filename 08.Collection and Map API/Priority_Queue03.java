import java.util.PriorityQueue;

public class Priority_Queue03{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        pq.add(45);
        pq.add(78);
        
        pq.add(12);
        pq.add(18);
        pq.add(78);
        System.out.println(pq);  // --> pq stores data in acending order 
    }
}

// Notes==> 1.  PriorityQueue  only stores integar values
            // 2.   PriorityQueue   stores data in acending/ increasing order
            // 3.   PriorityQueue  allows Duplicates