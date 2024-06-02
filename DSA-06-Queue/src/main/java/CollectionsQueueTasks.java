import java.util.*;

public class CollectionsQueueTasks {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("John");
        pq.add("Michael");
        pq.add("Carol");

        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());


        System.out.println("=============================TEST MyQueue=====================================");

        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);

        System.out.println("size if queue is: "+myQueue.size);
        System.out.println("front is: "+myQueue.peek());
        System.out.println("First remove from queue: "+myQueue.dequeue());






    }
}
