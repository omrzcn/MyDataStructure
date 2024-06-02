import java.math.BigInteger;
import java.util.Stack;

public class ReverseFirstKElementsQueueProblem {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        for (int i = 1; i < 6; i++) {
            myQueue.enqueue(i);
        }

        System.out.println("first: ");
        myQueue.printQueue();
        System.out.println();
        System.out.println("reversed: ");
        reverseFirstK(myQueue,4).printQueue();


    }

    public  static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k){

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue());
        }

        while (!stack.isEmpty()){
            queue.enqueue(stack.pop());
        }

        for (int i = 0; i < queue.size - k; i++) {
            queue.enqueue(queue.dequeue());
        }
        return queue;
    }


}
/*
Given an integer K and a queue of integers, write code to reverse the order
of the first K elements of the queue.
-Input: Q = [10, 20, 30, 40, 50], K = 4
-Output: Q = [40,30, 20, 10,50]

Hint: You can use stack to reverse the order of first K elements
 */