package CustomSinglyLinkedList;

public class MyLastDemo {
    Node1 head;
    Node1 tail;
    int size;


    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(int value){
        Node1 newNode = new Node1(value);
        if (isEmpty()){
            head=tail=newNode;
        }else {

            newNode.next = head;
            head= newNode;
        }
        size++;
    }

    public void addLast(int value){
        Node1 newNode = new Node1(value);
        if (isEmpty()){
            head=tail=newNode;
        }else {
            newNode.next = tail;
            tail=newNode;
        }
        size++;
    }

    public void printList(){

        Node1 current = head;

        while (current != null){
            if (current.next == null){
                System.out.println(current.value+" ==> null");
            }else {
                System.out.println(current.value+" ==> ");
            }
            current = current.next;
        }

    }


    public int getKthItemFromLast(int k){
        Node1 pointer1 = head;
        Node1 pointer2 = head;

        for (int i = 0; i < k - 1; i++) {
            pointer2 = pointer2.next;
        }
        while (pointer2.next != null){
            pointer1 = pointer1.next;
            pointer2=pointer2.next;
        }

        return pointer1.value;
    }

    public void deleteByValue(int value){
        Node1 current = head;
        Node1 previous = head;

        if (isEmpty()) {
            System.out.println("list is empty");
        }

        while (current.next == null){

            if (current.value == value){
                if (current==head){
                    head = current.next;
                    current.next = null;

                } else if (current==tail) {
                    tail = previous;
                    previous.next = null;

                }else {
                    previous.next = current.next;
                    current.next = null;

                }
                size--;
            }
            previous = current;
            current = current.next;

        }

    }

    public void removeKthItemFromLast(int k){
        Node1 prev = null;
        Node1 pointer1 = head;
        Node1 pointer2 = head;

        for (int i = 0; i < k - 1; i++) {
            pointer2= pointer2.next;
        }
        while (pointer2.next != null){
            prev = pointer1;
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;

        }
        if (pointer1 == head ){

            head = pointer1.next;
            pointer1.next = null;
            size--;

        } else if (pointer1 == tail) {
            tail = pointer1;
            pointer1.next=null;
            size--;
        }else {
            prev.next = pointer1.next;
            pointer1.next = null;
            size--;
        }


    }

    public int indexOfValue(int value){

        Node1 current = head;
        int position = 0 ;

        if (isEmpty()){
            return -1;
        }

        while (current.next != null){
           if (current.value == value){ // if there is match
               return position;
           }
           else {
               position ++;
               current = current.next;
           }
        }
        return -1;

    }


}
