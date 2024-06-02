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
        reverseFirstK(myQueue,3).printQueue();


    }

  public static MyQueue<Integer> reverseFirstK(MyQueue<Integer>myQueue,int k){ // lets say myQueue has 5,4,3,2,1

        Stack<Integer> stack = new Stack<>(); // stack created for accepting elements with reversed order

        // lets add queue elements to our stack

      for (int i = 0; i < k; i++) {
          stack.push(myQueue.dequeue()); // stack becomes 1,2,3,4,5
      }

      while (!stack.isEmpty()){
          myQueue.enqueue(stack.pop()); // myQueue becomes 5,4,3,2,1

      }

      for (int i = 0; i < myQueue.size-k; i++) {
          myQueue.enqueue(myQueue.dequeue()); // last myqueue becomes 1,2,3,4,5
      }


        return myQueue;
  }


}
/*
Given an integer K and a queue of integers, write code to reverse the order
of the first K elements of the queue.
-Input: Q = [10, 20, 30, 40, 50], K = 4
-Output: Q = [40,30, 20, 10,50]

Hint: You can use stack to reverse the order of first K elements
 */

/*
  public  static MyQueue<Integer> reverseFirstK(MyQueue<Integer> queue, int k){ // 5-4-3-2-1

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            stack.push(queue.dequeue()); // 1-2-3-4-5
        }

        while (!stack.isEmpty()){
            queue.enqueue(stack.pop()); //5-4-3-2-1
        }

        for (int i = 0; i < queue.size - k; i++) {
            queue.enqueue(queue.dequeue()); // 2-1-3-4-5
        }
        return queue;
    }
 */