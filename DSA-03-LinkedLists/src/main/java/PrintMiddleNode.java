import CustomSinglyLinkedList.DeleteDemo;
import CustomSinglyLinkedList.Node;

public class PrintMiddleNode {
    public static void main(String[] args) {
        DeleteDemo sll = new DeleteDemo();
        for (int i =1; i <= 5; i++) {
            sll.addAValue(i);
        }

        findMiddle(sll);


    }
    public static void printMiddle(DeleteDemo sll){
        //create 2 pointer
        Node pointer1 = sll.head;
        Node pointer2 = sll.head;


        // iterate over the linked list
                //bu ciftse              //bu tekse
        while (pointer2!=sll.tail && pointer2.next!=sll.tail){
            pointer1 = pointer1.next; // single jump
            pointer2 = pointer2.next.next; // double jump


        }
        if (pointer2 == sll.tail) System.out.println(pointer1.value);
        else System.out.println(pointer1.value+", "+ pointer1.next.value);





    }

    public static void findMiddle(DeleteDemo deleteDemo){

        Node a = deleteDemo.head;
        Node b = deleteDemo.head;

        while (b != deleteDemo.tail && b.next !=deleteDemo.tail){

            a = a.next;
            b = b.next.next;
        }

        if (b==deleteDemo.tail) System.out.println(a.value);
        if (b!=deleteDemo.tail) System.out.println(a.value+", "+a.next.value);




    }

}
