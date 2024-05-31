package ReverseNodes;

public class Reverse {
    public static void main(String[] args) {
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();


    }

    public static void reverse (MySinglyLinkedList list){
        // i created 2 pointers
        Node prev = list.head;
        Node current = list.head.next;

        while (current!=null){
            Node nextNode = current.next; // i had to create 3th pointer to keep the chain.
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        list.tail = list.head;
        list.tail.next = null;
        list.head = prev;


    }



    public static void reverseList(MySinglyLinkedList list){
        Node current = list.head.next;
        Node prev = list.head;

        while (current!= null){

            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;


        }

        list.tail = list.head;
        list.tail.next = null;
        list.head = prev;



    }















}
