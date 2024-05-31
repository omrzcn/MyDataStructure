package ReverseNodes;

public class Reverse {
    public static void main(String[] args) {
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            mySinglyLinkedList.add(i);
        }
        mySinglyLinkedList.printNodes();
        reverse(mySinglyLinkedList);
        mySinglyLinkedList.printNodes();

    }

    public static void reverse (MySinglyLinkedList list){
        // i just need 3 pointers in turn prev-->current-->nextNode
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
